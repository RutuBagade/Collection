package com.collection.serializable;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSet11 {

	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("anu");
		h1.add("ratan");
		h1.add("komal");
		h1.add("bansil");
		h1.add("chember");
		System.out.println(h1);
		ArrayList<String> list=new ArrayList<String>(h1);
		Collections.sort(list);//Ascending order
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());//Ascending order
		System.out.println(list);
		
		
	}

}
