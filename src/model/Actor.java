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


	protected Actor(String NAME, int AGE) {
		this.NAME = NAME;
		this.AGE = AGE;
		Actor.allActors.add(this);
	}

	public static List<Actor> getAllActors() {
		return allActors;
	}

	public String getNAME() {
		return NAME;
	}

	public int getAGE() {
		return AGE;
	}
}
