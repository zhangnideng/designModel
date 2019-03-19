package _12_compoundPattern.adapter.duck.impl;

import _12_compoundPattern.adapter.duck.Quackable;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
