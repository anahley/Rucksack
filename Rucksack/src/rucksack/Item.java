package rucksack;

public abstract class Item {
	
	/*
	 * Item.java
	 * 
	 * Purpose: This is an abstract class to encapsulate all different things in the inventory.
	 * All the different things will extend this class.
	 */
	
	protected static int ID = 0; 
	
	public Item() {
		ID += 1;
	}

	public static int getID() {
		return ID;
	}
	
}
