package list.comparable.css;

import java.util.Comparator;

public class EmpName implements Comparator<Emp1> {

	
	public int compare(Emp1 e1, Emp1 e2) {
	 
		return (e1.empname.compareTo(e2.empname));
	}

	
	

}
