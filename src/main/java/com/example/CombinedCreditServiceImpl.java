package com.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.jws.WebService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@WebService(endpointInterface = "com.example.CombinedCreditService")
public class CombinedCreditServiceImpl implements CombinedCreditService {
    private static final String CREDIT_SCORE_FILE = "data.json";
    private static final String BLACKLIST_FILE = "blacklist.json";
    private List<CreditScoreResponse> creditScores;
    private List<CreditScreeningResponse> blacklist;

    public CombinedCreditServiceImpl() {
        loadData();
    }

    private void loadData() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            creditScores = mapper.readValue(
                    new File(CREDIT_SCORE_FILE),
                    new TypeReference<List<CreditScoreResponse>>(){});
            blacklist = mapper.readValue(
                    new File(BLACKLIST_FILE),
                    new TypeReference<List<CreditScreeningResponse>>(){});
        } catch (IOException e) {
            // Carregar fallback ou lançar exceção
        }
    }

    @Override
    public CreditScoreResponse getCreditScore(CreditScoreRequest request) {
        return creditScores.stream()
                .filter(c -> c.getCpf().equals(request.getCpf()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("CPF não encontrado"));
    }

    @Override
    public CreditScreeningResponse checkCreditScreening(CreditScreeningRequest request) {
        return blacklist.stream()
                .filter(b -> b.getCpf().equals(request.getCpf()))
                .findFirst()
                .orElse(new CreditScreeningResponse(request.getCpf(), "Not found", false));
    }
}
