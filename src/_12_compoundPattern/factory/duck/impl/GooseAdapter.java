package _12_compoundPattern.factory.duck.impl;

import _12_compoundPattern.factory.duck.Goose;
import _12_compoundPattern.factory.duck.Quackable;

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
