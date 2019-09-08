package csce247.assignments.strategy;

public class Queen extends Character{
	
	
	public Queen(String name) {
		super(name);
		weaponBehavior = new WeaponKnife();
	}
	public void display() {
		System.out.println(name +" is a beautiful queen");
	}
}
