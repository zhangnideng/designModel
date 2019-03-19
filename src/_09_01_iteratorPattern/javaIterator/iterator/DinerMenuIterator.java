package _09_01_iteratorPattern.javaIterator.iterator;

import java.util.Iterator;

import _09_01_iteratorPattern.javaIterator.entity.MenuItem;

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

	@Override
	public void remove(){
		if(position <= 0){
			throw new IllegalStateException("You can't remove an item until you've done at least one next()");
		}
		if(items[position - 1] != null){
			for(int i = position-1; i < (items.length - 1); i++){
				items[i] = items[i+1];
			}
			items[items.length - 1] = null;
		}
	}
}
