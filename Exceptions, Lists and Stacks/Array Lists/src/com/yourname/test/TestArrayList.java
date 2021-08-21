package com.yourname.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.Jasen.model.Item;


public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item(1, "This is item 1"));
		items.add(new Item(2, "This is item 2"));
		items.add(new Item(3, "This is item 3"));
		items.add(new Item(4, "This is item 4"));
		items.add(new Item(5, "This is item 5"));
		
		//print out the third item
		System.out.println("Third item");
		System.out.println(items.get(2));
		
		//remove last item
		Item removed = items.remove(items.size()-1);
		System.out.println("Removed item");
		System.out.println(removed);
		
		//iterating over a list
		Iterator<Item> iter = items.iterator();
		
		System.out.println("Removing all items from list");
		while (iter.hasNext()) {
			Item item = iter.next();
			System.out.println("removing item: " + item);
			iter.remove();
			//iter.remove();  list is empty and will not work
			//items.add(new Item(6, "This is a new item")); also will not work 
			//trying to alter collection outside of calling the remove method
		}
		
		//confirm the size is 0
		System.out.println(items.size());
		
	}
	
	

}
