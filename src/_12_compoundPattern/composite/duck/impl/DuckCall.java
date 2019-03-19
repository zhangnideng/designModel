package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}
	@Override
	public String toString() {
		return "Duck Call";
	}
}
