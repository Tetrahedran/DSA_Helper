package model;

import java.util.LinkedList;
import java.util.List;

public class InventoryObject {

	private static List<InventoryObject> allInventoryObjects = new LinkedList<>();
	private final String NAME;
	private final double WEIGHT;
	private final double PRICE;

	public InventoryObject(String NAME, double WEIGHT, double PRICE) {
		this.NAME = NAME;
		this.WEIGHT = WEIGHT;
		this.PRICE = PRICE;
		allInventoryObjects.add(this);
	}

	public static List<InventoryObject> getAllInventoryObjects() {
		return allInventoryObjects;
	}

	public String getNAME() {
		return NAME;
	}

	public double getWEIGHT() {
		return WEIGHT;
	}

	public double getPRICE() {
		return PRICE;
	}
}
