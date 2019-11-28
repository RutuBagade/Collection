package com.collection.serializable;
import java.util.Comparator;

public class ProductName implements Comparator<Product>
	{

	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.prodName.compareTo(p2.prodName);
	}
	
	}

