package _09_02_compositePattern.compositePatternWithIterator.component.impl;

import java.util.ArrayList;
import java.util.Iterator;

import _09_02_compositePattern.compositePatternWithIterator.component.MenuComponent;
import _09_02_compositePattern.compositePatternWithIterator.iterator.CompositeIterator;



public class Menu extends MenuComponent{
	private Iterator<MenuComponent> iterator = null;
	private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("-------------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	
}
