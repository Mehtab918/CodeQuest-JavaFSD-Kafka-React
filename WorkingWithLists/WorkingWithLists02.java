package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class WorkingWithLists02 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println("arrayList instanceof ArrayList " + (arrayList instanceof ArrayList));
		
		System.out.println("\narrayList instanceof List " + (arrayList instanceof List));
		System.out.println("arrayList instanceof Collection " + (arrayList instanceof Collection));
		System.out.println("arrayList instanceof Iterable " + (arrayList instanceof Iterable));
		
		LinkedList<String> linkedList = new LinkedList<String>();

		System.out.println("\nlinkedList instanceof LinkedList " + (linkedList instanceof LinkedList));
		
		System.out.println("\nlinkedList instanceof List " + (linkedList instanceof List));
		System.out.println("linkedList instanceof Collection " + (linkedList instanceof Collection));
		System.out.println("linkedList instanceof Iterable " + (linkedList instanceof Iterable));

		Vector<String> vector = new Vector<String>();

		System.out.println("\nvector instanceof Vector " + (vector instanceof Vector));
		
		System.out.println("\nvector instanceof List " + (vector instanceof List));
		System.out.println("vector instanceof Collection " + (vector instanceof Collection));
		System.out.println("vector instanceof Iterable " + (vector instanceof Iterable));

	}

}