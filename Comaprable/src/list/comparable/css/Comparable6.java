package list.comparable.css;

import java.util.Collections;
import java.util.Stack;

public class Comparable6 {

	public static void main(String[] args)
	{
		Stack<Student> s1=new Stack<Student>();
		s1.push(new Student(4,"Ravi",'A'));
		s1.push(new Student(5,"Sai",'C'));
		s1.push(new Student(1,"Onkar",'X'));
		s1.push(new Student(2,"baji",'B'));
		Collections.sort(s1,new Studid());
		 for(Student s11:s1)
		   {
			 System.out.println(s11.studid+"--"+s11.studname+"--"+s11.studclass);  
		   }
		 System.out.println("----------------------");
		Collections.sort(s1,new studname());
		 for(Student s11:s1)
		   {
			 System.out.println(s11.studid+"--"+s11.studname+"--"+s11.studclass);  
		   }
		 System.out.println("----------------------");
		Collections.sort(s1,new Studentclass());
		
		 for(Student s11:s1)
		   {
			 System.out.println(s11.studid+"--"+s11.studname+"--"+s11.studclass);  
		   }
	}

}
