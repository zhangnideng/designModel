package _09_01_iteratorPattern.javaIterator.entity;

import java.util.ArrayList;
import java.util.Iterator;

import _09_01_iteratorPattern.javaIterator.entity.menu.Menu;

public class WaitressMenuList {

	private ArrayList<Menu> menus;
	
	public WaitressMenuList(ArrayList<Menu> menus){
		this.menus = menus;
	}
	
	public void printMenu(){
		Iterator<Menu> iterator = menus.iterator();
		while(iterator.hasNext()){
			Menu menu = iterator.next();
			printMenu(menu.createIterator());
		}
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
