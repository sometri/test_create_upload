package com.javacambodia.tryonbasic.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapsCollectionExample {
	public static void main(String[] args) {
		int count[] = {10, 15, 10, 20, 30, 10};
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		Map<String, Integer> hashTable = new Hashtable<String, Integer>();
		
		for (int i = 0; i < count.length; i++) {
			hashMap.put(String.valueOf(i), count[i]);
			treeMap.put(String.valueOf(i), count[i]);
			hashTable.put(String.valueOf(i), count[i]);
		}
		
		System.out.println("hashMap:");
		System.out.println(hashMap);
		
		System.out.println("treeMap:");
		System.out.println(treeMap);
		
		System.out.println("hashTable:");
		System.out.println(hashTable);
	}
}
