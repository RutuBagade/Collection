package com.dss.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap6 {

	public static void main(String[] args)
	{
		HashMap<Integer,Product> hm=new HashMap<Integer,Product>();
		hm.put(100, new Product(101,"Pen"));
		hm.put(200, new Product(201,"Tv"));
		hm.put(400, new Product(301,"Freeze"));
		hm.put(500, new Product(401,"mobile"));
		hm.put(300, new Product(501,"Shoes"));
		Set<Map.Entry<Integer,Product>> ss=hm.entrySet();
		Iterator<Map.Entry<Integer,Product>> itr=ss.iterator();
				while(itr.hasNext())
				{
					Map.Entry<Integer,Product> s1=itr.next();
			          Product p=(Product)s1.getValue();
			          if(p.pid==101)
			        	  itr.remove();
			          if(p.pname.equals("mobile"))
			        	  itr.remove();
				}
		for(Map.Entry<Integer,Product> h11:hm.entrySet())
		{
			Integer i=(Integer)h11.getKey();
			System.out.println(i);
			
			Product pp=(Product)h11.getValue();
			System.out.println(pp.pid+"--"+pp.pname);
			
		}
		

	}

}
