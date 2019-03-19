package _12_compoundPattern.decorator.duck.impl;

import _12_compoundPattern.decorator.duck.Quackable;

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
