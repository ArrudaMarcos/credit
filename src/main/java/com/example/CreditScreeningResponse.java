package com.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditScreeningResponse {
    private String cpf;
    private String reason;
    private boolean blocked;

    public CreditScreeningResponse() {
    }

    public CreditScreeningResponse(String cpf, String reason, boolean blocked) {
        this.cpf = cpf;
        this.reason = reason;
        this.blocked = blocked;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getCpf() {
        return cpf;
    }

    public String getReason() {
        return reason;
    }

    public boolean isBlocked() {
        return blocked;
    }
}

