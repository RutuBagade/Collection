package list.comparable.css;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ListIterator;

public class comparable2 {

	public static void main(String[] args) {
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(111,"Ravi",50000.00));
		a1.add(new Emp(555,"Anu",25000.00));
		a1.add(new Emp(333,"Sai",57800.00));
		a1.add(new Emp(888,"Kombdii",70000.00));
		a1.add(new Emp(222,"Priya",850000.00));
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		 for(Emp a:a1)
		 {
			 System.out.println(a.empid+"--"+a.empname+"--"+a.empsalary);
		 }
	}

}
