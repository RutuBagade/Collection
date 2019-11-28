package com.dss.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap1
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		lh.put(101, "Aa");
		lh.put(201, "Bb");
		lh.put(301, "Cc");
		lh.put(401, "Dd");
		System.out.println(lh);
		//print only keys
		Set<Integer> i =lh.keySet();
		System.out.println(i);
		//print only values
		Collection<String> c=lh.values();
		System.out.println(c);
		//print both
		//Set<Map.Entry<Integer,String>> ss=lh.entrySet();
	    for(Map.Entry<Integer,String> s1:lh.entrySet())
	    {
	    	System.out.println(s1.getKey()+"--"+s1.getValue());
	    }

	}

}
