package _08_templatePattern.simple.entity.impl;

import _08_templatePattern.simple.entity.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
