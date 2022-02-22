package com.sibanu.task1.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {

    private boolean status;

    private List<String> messages = new ArrayList<>();
    private T payload;

    public boolean isstatus() {
        return status;
    }

    public void setstatus(boolean status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<String> setMessages(List<String> messages) {
        return this.messages = messages;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

}
