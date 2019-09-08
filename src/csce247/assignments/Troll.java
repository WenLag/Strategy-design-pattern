package csce247.assignments;

public class Troll extends Character {
	
	
	public Troll(String name) {
		super(name);
		weaponBehavior = new WeaponAxe();
		
	}
	public void display() {
		System.out.println(name +" is a funny troll");
	}
}
