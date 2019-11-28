package list.comparable.css;
import java.util.Collections;
//import java.util.Iterator;
import java.util.LinkedList;

public class comparable4 {

	public static void main(String[] args) {
		LinkedList<Emp1> Empinfo=new LinkedList<Emp1>();
		Empinfo.add(new Emp1(4,"Sumeet",50000.0));
		Empinfo.add(new Emp1(5,"Sai",85000.00));
		Empinfo.add(new Emp1(1,"Amber",75000));
		Empinfo.add(new Emp1(2,"Chember",10000.0));
		Empinfo.add(new Emp1(7,"Dimber",25000.00));
	    System.out.println(Empinfo);
	  //  Collections.sort(Empinfo, new  Empsalarysort());
	    Collections.sort(Empinfo, new  EmpName());
	    for(Emp1 a:Empinfo)
	    {
	    	System.out.println(a.empid+"--"+a.empname+"--"+a.empsalary);
	    }

	}

}
