package com.dss.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args)
	{
		HashMap<Emp,Student> hm=new HashMap<Emp,Student>();
		hm.put(new Emp(101,"Rajesh"), new Student(11,"A"));
		hm.put(new Emp(201,"Amber"), new Student(21,"B"));
		hm.put(new Emp(301,"Chember"), new Student(31,"C"));
		hm.put(new Emp(401,"Timber"), new Student(41,"D"));
		hm.put(new Emp(501,"Amar"), new Student(51,"E"));
		Set<Emp> s=hm.keySet();
	   for(Emp ee:hm.keySet())
	   {
		System.out.println(ee.empid+"--"+ee.empname);
	   }
	   Collection<Student> c=hm.values();
	   for(Student ss:hm.values())
	   {
		   System.out.println(ss.stdid+"---"+ss.studname);
	   }
	   
	  Set<Map.Entry<Emp,Student>> s1= hm.entrySet();
	  Iterator<Map.Entry<Emp,Student>> itr=s1.iterator();
	  while(itr.hasNext())
	  {
		  Map.Entry ii=(Map.Entry)itr.next();
		  Emp ee=(Emp)ii.getKey();
		  System.out.println(ee.empid+"--"+ee.empname);
		  
		  
		  Student s3=(Student)ii.getValue();
		  System.out.println(s3.stdid+"---"+s3.studname);
		  
	  }
	}

}
