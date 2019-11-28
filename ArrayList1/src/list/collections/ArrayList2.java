package list.collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Emp(111,"mr.shrinivas"));
		al.add(new Student(121,"Ravi"));
		al.add(100);
		al.add("hello");
		//System.out.println(al);
		for (Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp oo=(Emp)o;
				System.out.println(oo.empid+"--"+oo.empname);
			}
			else if(o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.studid+"--"+s.studename);
			}
			else if(o instanceof String)
			{
				System.out.println((String)o); 
			}
			else 
			{ //Integer i=(Integer)o;
				System.out.println((Integer)o);
				
			}
		}

	}
}


