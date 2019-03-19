package _12_compoundPattern.factory.duck.impl;

import _12_compoundPattern.factory.duck.Quackable;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
