package _09_01_iteratorPattern.simpleIterator.iterator.impl;

import _09_01_iteratorPattern.simpleIterator.entity.MenuItem;
import _09_01_iteratorPattern.simpleIterator.iterator.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] items;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] items){
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position++;
		
		return menuItem;
	}

}
