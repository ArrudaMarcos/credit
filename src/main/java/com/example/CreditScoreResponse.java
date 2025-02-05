package com.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditScoreResponse {
    private String cpf;
    private String riskLevel;
    private double approvedAmount;
    private int approvedInstallments;
    private String recommendation;
    private int score;

    public CreditScoreResponse() {
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setApprovedAmount(double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public void setApprovedInstallments(int approvedInstallments) {
        this.approvedInstallments = approvedInstallments;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }

    public int getApprovedInstallments() {
        return approvedInstallments;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public int getScore() {
        return score;
    }
}

