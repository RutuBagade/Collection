package com.collection.serializable;

import java.util.Comparator;

public class EmpName implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.empname.compareTo(e2.empname);
	}
	

}
