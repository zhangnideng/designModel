package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
	@Override
	public String toString() {
		return "Redhead Duck";
	}
}
