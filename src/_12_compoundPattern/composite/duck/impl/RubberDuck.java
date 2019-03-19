package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

public class RubberDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
	@Override
	public String toString() {
		return "Rubber Duck";
	}
}
