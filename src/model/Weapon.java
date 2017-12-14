package model;

import java.util.LinkedList;
import java.util.List;

public class Weapon extends InventoryObject {
	private static List<Weapon> allWeapons = new LinkedList<>();
	private final String DAMAGE;

	public Weapon(String NAME, double WEIGHT, double PRICE, String DAMAGE) {
		super(NAME, WEIGHT, PRICE);
		this.DAMAGE = DAMAGE;
		allWeapons.add(this);
	}

	public static List<Weapon> getAllWeapons() {
		return allWeapons;
	}

	public String getDAMAGE() {
		return DAMAGE;
	}
}
