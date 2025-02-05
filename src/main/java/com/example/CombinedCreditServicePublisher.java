package com.example;

import jakarta.xml.ws.Endpoint;

public class CombinedCreditServicePublisher {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8000/creditservice";
        Endpoint.publish(url, new CombinedCreditServiceImpl());
        System.out.println("Serviço SOAP combinado rodando em: " + url);
    }
}

