package model;

import java.util.LinkedList;
import java.util.List;

/**
 * this class represents one piece of armor
 * @author Tetrahedran
 * @version 0.1
 */
public class Armor extends InventoryObject {
	private static List<Armor> allArmor = new LinkedList<>();
	private final double PROTECTION;
	private final double SLOW;

	/**
	 * constructor of class Armor
	 * @param NAME The name of this armor
	 * @param WEIGHT The weight of this armor
	 * @param PRICE The price of this armor
	 * @param PROTECTION The protection of this armor
	 * @param SLOW The slow caused by this armor
	 */
	public Armor(String NAME, double WEIGHT, double PRICE, double PROTECTION, double SLOW) {
		super(NAME, WEIGHT, PRICE);
		this.PROTECTION = PROTECTION;
		this.SLOW = SLOW;
		allArmor.add(this);
	}

	/**
	 * returns all available Armor pieces
	 * @return A List with all Armor objects
	 */
	public static List<Armor> getAllArmor() {
		return allArmor;
	}

	/**
	 * returns the protection offered by this armor
	 * @return the protection of this armor
	 */
	public double getPROTECTION() {
		return PROTECTION;
	}

	/**
	 * returns the slow caused by this armor
	 * @return the slow of this armor
	 */
	public double getSLOW() {
		return SLOW;
	}
}
