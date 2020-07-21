package Deco.DecoratorDesignPattern;

public class Cardecorator implements Car {

	protected Car car;
	
	public Cardecorator(Car c){
		this.car=c;
	}
	public void assemble() {
		this.car.assemble();
	}
	public void assemble1() {
		// TODO Auto-generated method stub
		
	}
	public void assemble2() {
		// TODO Auto-generated method stub
		
	}

}
