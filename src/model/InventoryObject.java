package model;

import java.util.LinkedList;
import java.util.List;

/**
 * This class represents objects that can be placed in an actors inventory
 * @author Tetrahedran
 * @version 0.1
 */
public class InventoryObject {

	private static List<InventoryObject> allInventoryObjects = new LinkedList<>();
	private final String NAME;
	private final double WEIGHT;
	private final double PRICE;

	/**
	 * constructor of class InventoryObject
	 * @param NAME the name of this object
	 * @param WEIGHT the weight of this object
	 * @param PRICE the price of this object
	 */
	public InventoryObject(String NAME, double WEIGHT, double PRICE) {
		this.NAME = NAME;
		this.WEIGHT = WEIGHT;
		this.PRICE = PRICE;
		allInventoryObjects.add(this);
	}

	/**
	 * returns all InventoryObjects
	 * @return A List that contains all InventoryObjects
	 */
	public static List<InventoryObject> getAllInventoryObjects() {
		return allInventoryObjects;
	}

	/**
	 * returns the name of this object
	 * @return the name of this object
	 */
	public String getNAME() {
		return NAME;
	}

	/**
	 * returns the weight of this object
	 * @return the weight of this object
	 */
	public double getWEIGHT() {
		return WEIGHT;
	}

	/**
	 * returns the price of this object
	 * @return the price of this object
	 */
	public double getPRICE() {
		return PRICE;
	}
}
