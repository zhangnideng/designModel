package _07_01_adapterPattern.simpleAdapterPattern.turkey.impl;

import _07_01_adapterPattern.simpleAdapterPattern.turkey.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
