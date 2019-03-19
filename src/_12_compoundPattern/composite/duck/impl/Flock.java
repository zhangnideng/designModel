package _12_compoundPattern.composite.duck.impl;

import _12_compoundPattern.composite.duck.Quackable;

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
	private ArrayList<Quackable> quackers = new ArrayList<Quackable>();
 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
	@Override
	public String toString() {
		return "Flock of Quackers";
	}
}
