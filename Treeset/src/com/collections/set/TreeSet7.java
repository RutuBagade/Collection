package com.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet7 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("aa");
		tr.add("xx");
		tr.add("tt");
		tr.add("yy");
		tr.add("dd");
		tr.add("cc");
		System.out.println(tr);
		System.out.println(tr.size());//6
		System.out.println(tr.first());//aa
		System.out.println(tr.last());//yy
		
		SortedSet<String> s3=tr.subSet("aa","xx");
		TreeSet<String> tsss=new TreeSet<String>(s3);
		System.out.println(tsss);
		
		SortedSet<String> ss=tr.headSet("tt");
		TreeSet<String> ts=new TreeSet<String>(ss);
		System.out.println(ts);
		
		SortedSet<String> s2=tr.tailSet("dd");
		TreeSet<String> tss=new TreeSet<String>(s2);
		System.out.println(tss);
		
       }
}


/*public int size();
public boolean isEmpty();
public boolean contains(java.lang.Object);
public boolean add(E);
public boolean remove(java.lang.Object);
public void clear();*/
