package Deco.DecoratorDesignPattern;

public class Scar extends Cardecorator {

	public Scar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}
