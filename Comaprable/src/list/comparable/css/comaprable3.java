package list.comparable.css;

import java.util.ArrayList;
import java.util.Collections;

public class comaprable3 {

	public static void main(String[] args) {
		ArrayList<Student> studentinfo=new ArrayList<Student>();
		studentinfo.add(new Student(4,"Ravi",'A'));
		studentinfo.add(new Student(5,"Sai",'C'));
		studentinfo.add(new Student(1,"Onkar",'X'));
		studentinfo.add(new Student(2,"baji",'B'));
	  // System.out.println(studentinfo);
	   for(Student s:studentinfo)
	   {
		 System.out.println(s.studid+"--"+s.studname+"--"+s.studclass);  
	   }
		
     // Collections.sort(studentinfo, new Studid());
     // System.out.println("---Sorting according to id's --------");
	  // Collections.sort(studentinfo, new studname());
	   Collections.sort(studentinfo, new Studentclass());
	    System.out.println("---Sorting according to Student name --------");
      for(Student s1:studentinfo)
	   {
		 System.out.println(s1.studid+"--"+s1.studname+"--"+s1.studclass);  
	   }
	}

}
