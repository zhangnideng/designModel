package _12_compoundPattern.factory.duck.impl;

import _12_compoundPattern.factory.duck.Quackable;

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
