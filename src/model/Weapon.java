package model;

import java.util.LinkedList;
import java.util.List;

/**
 * this class represents weapons
 * @author Tetrahedran
 * @version 0.1
 */
public class Weapon extends InventoryObject {
	private static List<Weapon> allWeapons = new LinkedList<>();
	private final String DAMAGE;

	/**
	 *constructor for class Weapon
	 * @param NAME The name of the weapon
	 * @param WEIGHT The weight of the weapon
	 * @param PRICE The price of the weapon
	 * @param DAMAGE The damage of the weapon
	 */
	public Weapon(String NAME, double WEIGHT, double PRICE, String DAMAGE) {
		super(NAME, WEIGHT, PRICE);
		this.DAMAGE = DAMAGE;
		allWeapons.add(this);
	}

	/**
	 * getter for all weapons
	 * @return all existing weapons
	 */
	public static List<Weapon> getAllWeapons() {
		return allWeapons;
	}

	/**
	 * getter for the damage
	 * @return the damage
	 */
	public String getDAMAGE() {
		return DAMAGE;
	}
}
