package com.phase.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Bengaluru");
		city.add("Chennai");
		city.remove("Delhi");
		System.out.println(city);
		System.out.println("Vector");
		Vector<Integer> vec = new Vector();
		vec.addElement(67);
		vec.addElement(89);
		vec.addElement(97);
		vec.set(2, 15);
		System.out.println(vec);
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Swathi");
		names.add("Lalith");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Hashset");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1001);
		set.add(1003);
		set.add(1011);
		set.add(1012);
		System.out.println(set);
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(31);
		set2.add(32);
		set2.add(34);
		System.out.println(set2);

	}
}