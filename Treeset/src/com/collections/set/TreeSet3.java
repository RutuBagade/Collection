package com.collections.set;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSet3 {

	public static void main(String[] args) {
		Vector<Character> v1=new Vector<Character>();
		v1.add('C');
		v1.add('A');
		v1.add('B');
		v1.add('C');
		v1.add('D');
		v1.add('A');
		System.out.println(v1);
		TreeSet<Character> t1=new TreeSet<Character>();
		t1.addAll(v1);
		t1.add('Z');
		t1.add('P');
		t1.add('T');
		System.out.println(t1);
		ArrayList<Character> a1=new ArrayList<Character>(v1);
		a1.add('H');
		a1.add('O');
		a1.add('J');
		a1.addAll(t1);
        System.out.println(a1);

		

	}

}
