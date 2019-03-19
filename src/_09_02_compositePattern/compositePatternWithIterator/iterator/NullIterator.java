package _09_02_compositePattern.compositePatternWithIterator.iterator;

import java.util.Iterator;

import _09_02_compositePattern.compositePatternWithIterator.component.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	
}
