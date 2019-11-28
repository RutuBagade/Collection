package com.collection.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1
{
	//private static Object FileOutputStream fos;

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
	{
	  ArrayList<Emp> a1=new ArrayList<Emp>();
	  a1.add(new Emp(101,"manas",25000.00));
	  a1.add(new Emp(201,"ruturaj",15000.00));
	  a1.add(new Emp(501,"tushar",45000.00));
	  a1.add(new Emp(701,"komal",35000.00));
	  a1.add(new Emp(801,"priyanka",15000.00));
	  a1.add(new Emp(401,"sarika",5000.00));
	  Collections.sort(a1,new EmpName());
	  FileOutputStream fos=new FileOutputStream("xyz.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(a1);
	  oos.close();
	  fos.close();
	  System.out.println("Serialization process is completed");
	    
	  FileInputStream fis=new FileInputStream("xyz.txt");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	  ArrayList<Emp> aa=(ArrayList<Emp>)ois.readObject();
	  for(Emp as:aa)
	  {
		  System.out.println(as.empid+"--"+as.empname+"--"+as.salary);
	  }
	  ois.close();
	  fis.close();
	  System.out.println("DeSerialization process is completed");
	  
	  


	}

}
