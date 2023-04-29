/**
 * 
 */
package com.javacambodia.tryonbasic.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author pongs
 *
 */
public class ListsCollectionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count[] = {10, 15, 10, 20, 30, 10};
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> vectorList = new Vector<Integer>();
		
		for (int i = 0; i < count.length; i++) {
			arrayList.add(count[i]);
			linkedList.add(count[i]);
			vectorList.add(count[i]);
		}
		
		System.out.println("ArrayList:");
		System.out.println(arrayList);
		
		System.out.println("LinkedList:");
		System.out.println(linkedList);
		
		System.out.println("Vector:");
		System.out.println(vectorList);
	}

}
