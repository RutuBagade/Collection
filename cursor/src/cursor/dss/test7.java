package cursor.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class test7 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("hii");
		a1.add("anu");
		a1.add("sagar");
		a1.add("rahul");
		System.out.println(a1);
		ListIterator<String> l1=a1.listIterator();
		l1.add("sonakshi");
		while(l1.hasNext())
		{
			//l1.add("hi");
			String s=l1.next();
			//System.out.println(s);
			if(s.equals("hii"))
			{
				l1.remove();}
			
			if(s.equals("rahul"))
			{
				l1.set("priyanka");}
		}
		System.out.println(a1);
	}
	

}
