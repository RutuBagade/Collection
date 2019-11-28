package com.collections.set;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		//Normal collection
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(1005);
		t1.add(80);
		t1.add(50);
		t1.add(20);
		System.out.println(t1);
		//generics collection
		TreeSet<String> t11=new TreeSet<String>();
	     t11.add("Psycho");
		  t11.add("Mad");
		  t11.add("Khadus");
		  t11.add("Amber");
          t11.add("Chinu");
		  System.out.println(t11);
		  //Integer type 
		  TreeSet<Integer> t111=new TreeSet<Integer>();
			t111.add(100);
			t111.add(1000);
			t111.add(800);
			t111.addAll(t1);
			t111.add(500);
			t111.add(200);
			System.out.println(t111);
	}

}
