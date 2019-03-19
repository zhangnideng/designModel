package _09_01_iteratorPattern.simpleIterator.iterator.impl;

import java.util.ArrayList;

import _09_01_iteratorPattern.simpleIterator.entity.MenuItem;
import _09_01_iteratorPattern.simpleIterator.iterator.Iterator;

public class PancakeHouseIterator implements Iterator<MenuItem>{
	private ArrayList<MenuItem> items;
	private int position = 0;
	
	

	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null){
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = items.get(position);
		position++;
		
		return item;
	}
	
	
}
