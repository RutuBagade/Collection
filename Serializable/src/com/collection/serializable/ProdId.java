package com.collection.serializable;

import java.util.Comparator;

public class ProdId implements Comparator<Product>
{
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.pid==p2.pid)
			return 0;
		else if(p1.pid>p2.pid)
			return 1;
		else
			return -1;
	}

}
