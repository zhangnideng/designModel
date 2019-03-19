package _09_02_compositePattern.compositePatternWithIterator.iterator;

import java.util.Iterator;
import java.util.Stack;

import _09_02_compositePattern.compositePatternWithIterator.component.MenuComponent;
import _09_02_compositePattern.compositePatternWithIterator.component.impl.Menu;

public class CompositeIterator implements Iterator<MenuComponent> {
	
	private Stack<Iterator<MenuComponent>> stack = new Stack<>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if(hasNext()){
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if(component instanceof Menu){
				stack.push(component.createIterator());
			}
			
			return component;
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	
}
