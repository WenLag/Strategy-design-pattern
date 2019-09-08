package csce247.assignments;

public abstract class Character{
	protected String name;
	protected WeaponBehavior weaponBehavior;
	
	public Character(String name) {
		this.name = name;
	}
	
	public void attack() {
		weaponBehavior.attack();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
	
	public void display() {
	}

	
}
