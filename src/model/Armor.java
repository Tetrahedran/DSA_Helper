package model;

import java.util.LinkedList;
import java.util.List;

public class Armor extends InventoryObject {
	private static List<Armor> allArmor = new LinkedList<>();
	private final double PROTECTION;
	private final double SLOW;

	public Armor(String NAME, double WEIGHT, double PRICE, double PROTECTION, double SLOW) {
		super(NAME, WEIGHT, PRICE);
		this.PROTECTION = PROTECTION;
		this.SLOW = SLOW;
		allArmor.add(this);
	}

	public static List<Armor> getAllArmor() {
		return allArmor;
	}

	public double getPROTECTION() {
		return PROTECTION;
	}

	public double getSLOW() {
		return SLOW;
	}
}
