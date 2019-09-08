package csce247.assignments.strategy;

public class King extends Character {
	
	public King(String name) {
		super(name);
		weaponBehavior = new WeaponSword();
	}
	public void display() {
		System.out.println(name + " is a Noble king");
	}
	
	
	
}
