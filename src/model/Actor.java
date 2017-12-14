package model;

import java.util.LinkedList;
import java.util.List;

/**
 * this class represents an actor in DSA
 * @author Tetrahedran
 * @version 0.1
 */
@SuppressWarnings("unused")
public abstract class Actor {
	private static List<Actor> allActors = new LinkedList<>();
	private final String NAME;
	private final int AGE;
	private List<InventoryObject> inventory;


	protected Actor(String NAME, int AGE) {
		this.NAME = NAME;
		this.AGE = AGE;
		inventory = new LinkedList<>();
		Actor.allActors.add(this);
	}

	//getter methods

	public static List<Actor> getAllActors() {
		return allActors;
	}

	public String getNAME() {
		return NAME;
	}

	public int getAGE() {
		return AGE;
	}

	public List<InventoryObject> getInventory() {
		return inventory;
	}

	//Setter methods

	public void addToInventory(InventoryObject object){
		inventory.add(object);
	}

	public void addToInventory(List<InventoryObject> objects){
		inventory.addAll(objects);
	}

	//other methods

	public boolean removeFromInventory(InventoryObject object){
		return inventory.remove(object);
	}

	public boolean removeFromInventory(List<InventoryObject> objects){
		return inventory.removeAll(objects);
	}

}
