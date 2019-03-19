package _12_compoundPattern.decorator.duck;

public class Goose {
	public void honk() {
		System.out.println("Honk");
	}
	@Override
	public String toString() {
		return "Goose";
	}
}
