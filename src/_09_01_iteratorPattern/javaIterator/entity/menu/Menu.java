package _09_01_iteratorPattern.javaIterator.entity.menu;

import java.util.Iterator;
import _09_01_iteratorPattern.javaIterator.entity.MenuItem;

public interface Menu {

	Iterator<MenuItem> createIterator();
}
