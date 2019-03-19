package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

public class QuackCounter implements Quackable {
	private Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
	@Override
	public String toString() {
		return duck.toString();
	}
}
