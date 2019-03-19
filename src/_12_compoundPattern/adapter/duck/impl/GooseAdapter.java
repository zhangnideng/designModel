package _12_compoundPattern.adapter.duck.impl;

import _12_compoundPattern.adapter.Goose;
import _12_compoundPattern.adapter.duck.Quackable;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
