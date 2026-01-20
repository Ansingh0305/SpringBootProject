package com.anant.ecommerce.dto;

public class PaymentWebhookRequest {

    private String event;

    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }
}
