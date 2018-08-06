package com.tsystems.services.impl;

import com.tsystems.domain.SimpleDomainModel;
import com.tsystems.services.SimpleService;

public class SimpleServiceImpl implements SimpleService {

    private SimpleDomainModel simpleDomainModel;

    public SimpleServiceImpl() {
        System.out.println("Constructor in SimpleServiceImpl.");
    }

    public SimpleServiceImpl(SimpleDomainModel simpleDomainModel) {
        this();
        this.simpleDomainModel = simpleDomainModel;
    }

    public void init() {
        System.out.println("init method in SimpleServiceImpl.");
    }

    public void destroy() {
        System.out.println("destroy method in SimpleServiceImpl.");
    }

    @Override
    public SimpleDomainModel getDomainModel() {
        return simpleDomainModel;
    }
}
