package com.dss.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Hashmap4
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Ravi",101);
		hm.put("Kunal",201);
		hm.put("Amber",501);
		hm.put("Chember",701);
		hm.put("Timber",801);
		hm.put("Sember",301);
		System.out.println(hm);
		 String valuetoberemoved="Amber";
		Set<Map.Entry<String,Integer>> itr=hm.entrySet();
		Iterator<Map.Entry<String,Integer>> i=itr.iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Integer> ee=i.next();
			if(valuetoberemoved.equalsIgnoreCase(ee.getKey()))
				i.remove();
			System.out.println(ee.getKey()+"---"+ee.getValue());
		}
		System.out.println(hm);
		


	}

}
