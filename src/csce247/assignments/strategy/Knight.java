package csce247.assignments.strategy;

public class Knight extends Character{
	
	
	public Knight(String name) {
		super(name);
		weaponBehavior = new WeaponBow();
		
	}	
	public void display() {
		System.out.println(name +" is a valiant knight");
	}
}
