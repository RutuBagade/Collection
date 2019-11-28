package com.dss.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap3 {

	public static void main(String args[]){  
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();     
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		      hm.put(103, "Gaurav");
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(104, "Gaurav");  
		      System.out.println("After  putIfAbsent() method ---------");  
		      for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After  putAll() method ---------");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		 }  
}
