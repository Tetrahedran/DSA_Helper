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

	/**
	 * returns all created actors
	 * @return List with all actors
	 */
	public static List<Actor> getAllActors() {
		return allActors;
	}


	/**
	 * returns the name of the actor
	 * @return the name of the actor
	 */
	public String getNAME() {
		return NAME;
	}

	/**
	 * returns the age of the actor
	 * @return the age of the actor
	 */
	public int getAGE() {
		return AGE;
	}

	/**
	 * returns the inventory of the actor
	 * @return the inventory of the actor
	 */
	public List<InventoryObject> getInventory() {
		return inventory;
	}

	//Setter methods

	/**
	 * adds an InventoryObject to the actors inventory
	 * @param object the InventoryObject to add
	 */
	public void addToInventory(InventoryObject object){
		inventory.add(object);
	}

	/**
	 * adds a List of InventoryObjects to the actors inventory
	 * @param objects the List to add
	 */
	public void addToInventory(List<InventoryObject> objects){
		inventory.addAll(objects);
	}

	//other methods

	/**
	 * removes the specified InventoryObject from the actors inventory
	 * @param object the InventoryObject to remove
	 * @return true if the object was removed successfully
	 */
	public boolean removeFromInventory(InventoryObject object){
		return inventory.remove(object);
	}

	/**
	 * removes a List of InventoryObjects from the actors inventory
	 * @param objects the List of InventoryObjects to remove
	 * @return true if at least one object was removed
	 */
	public boolean removeFromInventory(List<InventoryObject> objects){
		return inventory.removeAll(objects);
	}

}
