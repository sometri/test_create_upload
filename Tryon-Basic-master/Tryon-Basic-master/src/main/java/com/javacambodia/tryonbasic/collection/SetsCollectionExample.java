/**
 * 
 */
package com.javacambodia.tryonbasic.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author pongs
 *
 */
public class SetsCollectionExample {

	private static SetsCollectionExample collectionEx = new SetsCollectionExample();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//collectionEx.example1();
		collectionEx.example2();
		// Set Interface
	}
	
	protected void example1() {
		// Iterator interface : add, iterate, remove
		Collection<String> c = new TreeSet<String>();
		c.add("A");
		c.add("B");
		c.add("C");
		System.out.println(c.size());
		
		for (Iterator<String> it = c.iterator(); it.hasNext();) {
			it.next();
			it.remove();
		}
		System.out.println(c.size());
	}
	
	protected void example2() {
		int count[] = {10, 15, 10, 20, 30, 50};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 5; i++) {
			set.add(count[i]);
		}
		System.out.println("HashSet forbids duplicates");
		System.out.println(set);
		
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		for (int i = 0; i < 5; i++) {
			sortedSet.add(count[i]);
		}
		System.out.println("SortedSet sorted the elements and forbids duplicates");
		System.out.println(sortedSet);
	}

}
