package list.collections;

import java.util.ArrayList;
public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(111,"rtan"));
		a1.add(new Emp(444,"hii"));
		a1.add(new Emp(333,"hello"));
		a1.add(new Emp(222,"say"));
		for(Emp e:a1)
		{
			System.out.println(e.empid+"--"+e.empname);
		}
		ArrayList<Student> a2=new ArrayList<Student>();
		a2.add(new Student(111,"rtan"));
		a2.add(new Student(444,"hii"));
		a2.add(new Student(333,"hello"));
		a2.add(new Student(222,"say"));
		System.out.println(a2);
		for(  Student o:a2)
		{
			System.out.println(o.studename="--"+o.studid);
		}
		
		
		
	}

}
