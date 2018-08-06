package com.tsystems.domain;

import java.util.UUID;

public class PrototypeDomainModel {

    private final String message;

    public PrototypeDomainModel() {
        this.message = UUID.randomUUID().toString();
    }

    public void init() {
        System.out.println(String.format("Init prototype domain model: %s.", message));
    }

    public void destroy() {
        System.out.println(String.format("Destroy prototype domain model: %s", message));
    }

    public String getMessage() {
        return message;
    }
}
