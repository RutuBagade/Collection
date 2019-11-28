package com.dss.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(100,"Value of 1 -100");
		hm1.put(200,"Value of 1 -200");
		hm1.put(300,"Value of 1 -300");
       	hm1.put(400,"Value of 1 -400");
       	hm1.put(500,"Value of 1 -500");
       	hm1.put(600,"Value of 1 -600");
       	System.out.println(hm1);
       	Set<Integer> h=hm1.keySet();
       	System.out.println(h);
       	Collection<String> c=hm1.values();
       	System.out.println(c);
       	Set<Map.Entry<Integer,String>> s1=hm1.entrySet();
       	for(Map.Entry<Integer,String> e:s1)
       	{
       		System.out.println(e.getKey()+"--"+e.getValue());
       	}
       	

	}

}
