package com.collections.set;

import java.util.Comparator;

public class EmpId implements Comparator<Emp>
{
	public int compare(Emp e1 , Emp e2) {
		if(e1.empid==e2.empid)
		return 0;
		else if(e1.empid>e2.empid)
			return 1;
		else
			return -1;
	}

}
