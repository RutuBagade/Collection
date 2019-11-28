package com.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet<Integer> tr=new TreeSet<Integer>(new Myclass());
		tr.add(100);
		tr.add(10);
		tr.add(200);
		tr.add(30);
		tr.add(50);
        System.out.println(tr);
	}

}

class Myclass implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

	
	
	
}