package com.dss.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) 
	{
		HashMap<String,Character> hm=new HashMap<String,Character>();
		hm.put("anu", 'A');
		hm.put("komal", 'K');
		hm.put("kallu", 'K');
		hm.put("Babu", 'B');
		System.out.println(hm);
		//returns only key values
		Set<String> s=hm.keySet();
		System.out.println(s);
		//returns only values
		Collection<Character> c=hm.values();
		System.out.println(c);
		//return both key-value pair
		Set<Map.Entry<String,Character>> cc=hm.entrySet();
		for(Map.Entry<String,Character> c1:cc)
		{
			System.out.println(c1.getKey()+"--"+c1.getValue());
		}
		
	}

}
