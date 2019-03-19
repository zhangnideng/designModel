package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

public class MallardDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
	@Override
	public String toString() {
		return "Mallard Duck";
	}
}
