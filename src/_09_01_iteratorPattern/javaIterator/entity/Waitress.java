package _09_01_iteratorPattern.javaIterator.entity;

import java.util.Iterator;

import _09_01_iteratorPattern.javaIterator.entity.menu.Menu;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu){
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
