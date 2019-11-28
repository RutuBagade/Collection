package com.collection.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class linkedlist1 {

	public static void main(String[] args) throws Exception
	{
		LinkedList<Product> l1=new LinkedList<Product>();
		l1.add(new Product(111,"Pen",25.75));
		l1.add(new Product(511,"Tv",25000.75));
		l1.add(new Product(101,"Freeze",30000.75));
		l1.add(new Product(71,"Oven",5000.75));
		l1.add(new Product(61,"Lcd",20000.75));
		Collections.sort(l1,new ProdId());
		System.out.println(l1);
		Collections.sort(l1,new ProductName());
		System.out.println(l1);
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(l1);
		oos.close();
		fos.close();
		System.out.println("Serialization process is completed");
	    
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		LinkedList<Product> li=(LinkedList<Product>)ois.readObject();
	    for(Product p:li)
	    {
	    	System.out.println(p.pid+"--"+p.prodName+"--"+p.prodcost);
	    }
		ois.close();
		fis.close();
		System.out.println("Deserialization process is completed");
	    	
	}
	

}
