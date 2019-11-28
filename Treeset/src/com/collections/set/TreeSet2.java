package com.collections.set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Integer>t1=new TreeSet<Integer>();
		t1.add(10);
		t1.add(100);
		t1.add(80);
		t1.add(50);
		t1.add(20);
		//t1.add(null);
		System.out.println(t1);
		TreeSet<Integer>t2=new TreeSet<Integer>(t1);//pass collection t1
		t2.add(75);
		t2.add(95);
		t2.add(25);
		System.out.println(t2);//displayed data in sorting order
        System.out.println("-----------------------");
        ArrayList<String> a1=new  ArrayList<String>();
        a1.add("Komal");
        a1.add("Varsha");
        a1.add("Pooja");
        a1.add("Sayali");
        a1.add("Amber");
        System.out.println(a1);
    	TreeSet<String> t11=new TreeSet<String>(a1);//pass arrayList collection a1//duplicates are not allowed
	     t11.add("Psycho");
		  t11.add("Mad");
		  t11.add("Khadus");
		  t11.add("Amber");
         t11.add("Chinu");
		  System.out.println(t11);//data prints in sorted order
		  System.out.println("-----------------------");
			TreeSet<String> t111=new TreeSet<String>();
		     t111.add("Psycho");
			  t111.add("Mad");
			  t111.add("Sayali");
			  t111.add("Amber");
	         t111.add("Chinu");
	         //t11.add(null);
	         System.out.println(t111);
	         ArrayList<String> a11=new  ArrayList<String>(t111);
	         a11.add("Komal");
	         a11.add("Varsha");
	         a11.add("Pooja");
	         a11.add("Sayali");
	         a11.add("Amber");//insertion order is not maintained
	         System.out.println(a11);
	         //data sorted manner in descending order
	         Collections.sort(a11,Collections.reverseOrder());
	         System.out.println(a11);
	         TreeSet<String> t12=new TreeSet<String>();
	         t12.addAll(a11);
	         System.out.println(t12);
	         
	}

}
