package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class WorkingWithLists04 {

	public static void main(String[] args) {
		
		Collection<String> arrayList = new ArrayList<String>();
		
		System.out.println("arrayList instanceof ArrayList " + (arrayList instanceof ArrayList));
		
		Collection<String> linkedList = new LinkedList<String>();

		System.out.println("\nlinkedList instanceof LinkedList " + (linkedList instanceof LinkedList));
		
		Collection<String> vector = new Vector<String>();

		System.out.println("\nvector instanceof Vector " + (vector instanceof Vector));
		
	}

}