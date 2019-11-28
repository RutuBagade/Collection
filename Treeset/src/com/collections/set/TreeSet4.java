package com.collections.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		   a.add(10);
		   a.add(50);
	       System.out.println(a);
		TreeSet<Integer> tr=new TreeSet<Integer>(a);
		tr.add(100);
		tr.add(500);
		tr.add(700);
		tr.add(200);
		tr.add(150);
		   System.out.println(tr);
		   System.out.println("--------------------------");
		   ArrayList<Integer> a1=new ArrayList<Integer>();
		   a1.add(10);
		   a1.add(50);
	       System.out.println(a);
	       a1.addAll(tr);
	       a1.addAll(a);
	       System.out.println(a1);
	       TreeSet<Integer> tr1=new TreeSet<Integer>(a1);
	       System.out.println(tr1);
	       
		   
	}

}
