package com.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditScoreRequest {
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CreditScoreRequest() {
    }

    public String getCpf() {
        return cpf;
    }
}

