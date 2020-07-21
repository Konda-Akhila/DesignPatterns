package Deco.DecoratorDesignPattern;

public class Lcar extends Cardecorator {

	public Lcar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}