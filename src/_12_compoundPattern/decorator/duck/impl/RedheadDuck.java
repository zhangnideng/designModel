package _12_compoundPattern.decorator.duck.impl;

import _12_compoundPattern.decorator.duck.Quackable;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
