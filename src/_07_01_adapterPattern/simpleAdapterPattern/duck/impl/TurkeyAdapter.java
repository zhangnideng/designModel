package _07_01_adapterPattern.simpleAdapterPattern.duck.impl;

import _07_01_adapterPattern.simpleAdapterPattern.duck.Duck;
import _07_01_adapterPattern.simpleAdapterPattern.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
