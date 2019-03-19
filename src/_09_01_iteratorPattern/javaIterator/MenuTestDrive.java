package _09_01_iteratorPattern.javaIterator;

import _09_01_iteratorPattern.javaIterator.entity.Waitress;
import _09_01_iteratorPattern.javaIterator.entity.menu.impl.DinerMenu;
import _09_01_iteratorPattern.javaIterator.entity.menu.impl.PancakeHouseMenu;

public class MenuTestDrive {

	public static void main(String args[]){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
