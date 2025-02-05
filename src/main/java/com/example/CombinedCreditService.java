package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CombinedCreditService {
    @WebMethod
    CreditScoreResponse getCreditScore(CreditScoreRequest request);

    @WebMethod
    CreditScreeningResponse checkCreditScreening(CreditScreeningRequest request);
}
