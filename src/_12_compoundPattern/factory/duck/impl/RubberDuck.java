package _12_compoundPattern.factory.duck.impl;

import _12_compoundPattern.factory.duck.Quackable;

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
