package _09_01_iteratorPattern.simpleIterator;

import _09_01_iteratorPattern.simpleIterator.entity.DinerMenu;
import _09_01_iteratorPattern.simpleIterator.entity.PancakeHouseMenu;
import _09_01_iteratorPattern.simpleIterator.entity.Waitress;

public class MenuTestDrive {

	public static void main(String args[]){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
