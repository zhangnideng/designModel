package _09_02_compositePattern.simpleCompositePattern.component.impl;

import java.util.ArrayList;
import java.util.Iterator;

import _09_02_compositePattern.simpleCompositePattern.component.MenuComponent;


public class Menu extends MenuComponent{

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