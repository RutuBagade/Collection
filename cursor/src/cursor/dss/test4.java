package cursor.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class test4 {

	public static void main(String[] args) {
		//Arraylist approach
		System.out.println("--------ArrayList------------");
	    ArrayList<String> al=new ArrayList<String>();
	    al.add("cyber");
	    al.add("success");
	    al.add("software");
	    al.add("training");
	    ListIterator<String> i1=al.listIterator();
	    while(i1.hasNext())
	    {
	    	String s=i1.next();
	    	System.out.println(s+ " ");
	    }
	    //reverse direction
	    System.out.println("--------ArrayList------------");
	    while(i1.hasPrevious())
	    {
	    	String s=i1.previous();
	    	System.out.println(s+ " ");
	    }
	}

}
