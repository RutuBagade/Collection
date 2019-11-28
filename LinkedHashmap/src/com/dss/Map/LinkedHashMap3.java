package com.dss.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap3 {

	public static void main(String[] args)
	{
		LinkedHashMap<Product,Course> lm=new LinkedHashMap<Product,Course>();
		lm.put(new Product(11,"Pen"), new Course(101,"Core java"));
		lm.put(new Product(22,"Tv"), new Course(201,"Advanced java"));
		lm.put(new Product(33,"Freeze"), new Course(301,"Manual Testing"));
		lm.put(new Product(44,"Tubes"), new Course(401,"Selenium Testing"));
		Set<Product> p=lm.keySet();
		for(Product pp:lm.keySet())
		{
			System.out.println(pp.pid+"---"+pp.pname);
		}
		//print the values
		Collection<Course> c=lm.values();
		for(Course cc:lm.values())
		{
			System.out.println(cc.courseid+"--"+cc.coursename);
		}
		//Without using iterator cursor
	}

}
