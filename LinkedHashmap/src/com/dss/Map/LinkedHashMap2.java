package com.dss.Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2
{
	public static void main(String[] args)
	{
	LinkedHashMap<String,String> lh=new LinkedHashMap<String,String>();
	lh.put("A", "ravi");
	lh.put("B", "mangesh");
	lh.put("C", "suraj");
	lh.put("D", "amber");
	lh.put("E", "chember");
	Set<String> s1=lh.keySet();
	System.out.println(s1);
	Collection c=lh.values();
	System.out.println(c);
     String s="suraj";
	Set<Map.Entry<String,String>> ss=lh.entrySet();
	Iterator<Map.Entry<String,String>> i=ss.iterator();
	while(i.hasNext())
	{
		Map.Entry<String, String> m1=i.next();
		if(m1.getValue().equals("ravi"))
		{
			i.remove();
		}
		
	}
	for(Map.Entry<String,String> t:lh.entrySet())
	{
		System.out.println(t.getKey()+"--"+t.getValue());
	}
	
	}

}
