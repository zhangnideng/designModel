package _12_compoundPattern.decorator.duck.impl;

import _12_compoundPattern.decorator.duck.Quackable;

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
