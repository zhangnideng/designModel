package _12_compoundPattern.decorator.duck.impl;

import _12_compoundPattern.decorator.duck.Goose;
import _12_compoundPattern.decorator.duck.Quackable;

public class GooseAdapter implements Quackable {
	private Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}
	@Override
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
