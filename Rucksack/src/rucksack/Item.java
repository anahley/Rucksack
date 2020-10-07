package rucksack;

public abstract class Item {
	
	/*
	 * Item.java
	 * 
	 * Purpose: Makes an abtract class for all subclasses to fall under.
	 * 			Every object that is handled will be an Item, in its most general sense
	 */
	
	protected static int ID = 0; 
	
	public Item() {
		ID += 1;
	}

	public static int getID() {
		return ID;
	}
	
}
