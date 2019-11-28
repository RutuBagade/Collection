package list.comparable.css;

public class Emp implements Comparable{
	int empid;
	String empname;
	double empsalary;
	public Emp(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		
	}
	//according to empid
	/*public int compareTo(Object o) 
	  {
		Emp e1=(Emp)o;
		if(empid==e1.empid)
		{
			return 0;
		}
		else if(empid<e1.empid)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}*/
	//sorting according to salary
	/*public int compareTo(Object o) 
	  {
		Emp e1=(Emp)o;
		if(empsalary==e1.empsalary)
		{
			return 0;
		}
		else if(empsalary>e1.empsalary)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}*/
	//According to empname
	public int compareTo(Object o) 
	{
		Emp e1=(Emp)o;
		return empname.compareTo(e1.empname);
	}
	

}
