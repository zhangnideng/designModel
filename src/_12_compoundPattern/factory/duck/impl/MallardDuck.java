package _12_compoundPattern.factory.duck.impl;

import _12_compoundPattern.factory.duck.Quackable;

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
