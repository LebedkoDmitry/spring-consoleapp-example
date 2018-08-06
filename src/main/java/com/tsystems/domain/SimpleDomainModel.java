package com.tsystems.domain;

public class SimpleDomainModel {

    private final String constructorField;
    private String setterField;
    private String initField;

    public SimpleDomainModel(String constructorField) {
        this.constructorField = constructorField;
    }

    public void init() {
        initField = "init message";
    }

    public void destroy() {
        System.out.println("Destroy simple domain model method call.");
    }

    public String getConstructorField() {
        return constructorField;
    }

    public String getSetterField() {
        return setterField;
    }

    public void setSetterField(String setterField) {
        this.setterField = setterField;
    }

    public String getInitField() {
        return initField;
    }

    @Override
    public String toString() {
        return "SimpleDomainModel{" +
                "constructorField='" + constructorField + '\'' +
                ", setterField='" + setterField + '\'' +
                ", initField='" + initField + '\'' +
                '}';
    }
}
