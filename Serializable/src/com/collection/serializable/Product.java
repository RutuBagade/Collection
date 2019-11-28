package com.collection.serializable;

import java.io.Serializable;

public class Product implements Serializable
{
	int pid;
	String prodName;
	double prodcost;
	public Product(int pid, String prodName, double prodcost) {
		super();
		this.pid = pid;
		this.prodName = prodName;
		this.prodcost = prodcost;
	}
	public String toString()
	{
		return (pid+"--"+prodName+"--"+prodcost) ;
	}
}
