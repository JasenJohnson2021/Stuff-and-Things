package com.jasen.testing;

import com.jasen.datastructures.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		list.set(0, "Apple");
		System.out.println(list.get(0));
		
		int index = list.add("Banana");
		
		System.out.println(index);
		System.out.println(list.get(index));
		
		list.add("Canteloupe");
        list.add("Dragonfruit");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeyberry");
        list.add("Jujube");
        
        String value = list.remove();
        System.out.println(value);
        
        value = list.remove();
        System.out.println(value);
	}

}
