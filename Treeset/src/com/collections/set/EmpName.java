package com.collections.set;

import java.util.Comparator;

public class EmpName implements Comparator<Emp> 
{
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return -e1.empname.compareTo(e2.empname);
	}

}
