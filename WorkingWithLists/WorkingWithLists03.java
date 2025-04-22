package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class WorkingWithLists03 {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		System.out.println("arrayList instanceof ArrayList " + (arrayList instanceof ArrayList));
		
		List<String> linkedList = new LinkedList<String>();

		System.out.println("\nlinkedList instanceof LinkedList " + (linkedList instanceof LinkedList));
		
		List<String> vector = new Vector<String>();

		System.out.println("\nvector instanceof Vector " + (vector instanceof Vector));
		
	}

}