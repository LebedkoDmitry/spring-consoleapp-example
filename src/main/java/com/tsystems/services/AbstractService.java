package com.tsystems.services;

public class AbstractService {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showMessage() {
        System.out.println("Do some action in abstract service.");
        System.out.println(String.format("Message: %s", message));
    }

}
