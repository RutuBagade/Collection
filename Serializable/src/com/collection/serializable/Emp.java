package com.collection.serializable;

import java.io.Serializable;

public class Emp implements Serializable
{
 int empid;
 String empname;
 double salary;
public Emp(int empid, String empname, double salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
}
 
}
