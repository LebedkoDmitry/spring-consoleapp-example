package com.tsystems.services.impl.annotated;

import com.tsystems.domain.SimpleDomainModel;
import com.tsystems.domain.annotated.SimpleComponent;
import com.tsystems.services.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotatedSimpleServiceImpl implements SimpleService {

    private SimpleComponent simpleComponent;

    public AnnotatedSimpleServiceImpl() {
        System.out.println("Constructor in AnnotatedSimpleServiceImpl.");
    }

    @Autowired
    public AnnotatedSimpleServiceImpl(SimpleComponent simpleComponent) {
        this();
        this.simpleComponent = simpleComponent;
    }

    public void init() {
        System.out.println("init method in AnnotatedSimpleServiceImpl.");
    }

    public void destroy() {
        System.out.println("destroy method in AnnotatedSimpleServiceImpl.");
    }

    @Override
    public SimpleDomainModel getDomainModel() {
        return new SimpleDomainModel(simpleComponent.getConstructorField());
    }
}
