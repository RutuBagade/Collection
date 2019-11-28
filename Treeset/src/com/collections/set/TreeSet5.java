package com.collections.set;

import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) {
		TreeSet<Emp> tr=new TreeSet<Emp>(new EmpDept());
		tr.add(new Emp(101,"Ravi","Electronics"));
		tr.add(new Emp(501,"Anu","It"));
		tr.add(new Emp(301,"Shreya","Electrical"));
		tr.add(new Emp(701,"Baby","Power"));
		tr.add(new Emp(601,"Komal","Mechanical"));
        for(Emp ee:tr)
        {
        	System.out.println(ee.empid+"--"+ee.empname+"--"+ee.empdept);
        }
       
	}

}
