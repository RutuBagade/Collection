package cursor.dss;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.LinkedList;
import java.util.ListIterator;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		    System.out.println("--------LinkedList------------");
		    //linkedlist approach
		    LinkedList<Character> l1=new LinkedList<Character>();
		    l1.add('A');
		    l1.add('B');
		    l1.add('C');
		    l1.add('D');
		    l1.add(null);
		    ListIterator<Character> i2=l1.listIterator();
		    while(i2.hasNext())
		    {
		    	Character i=i2.next();
		    	System.out.println(i+ " ");
		    }    
		    System.out.println("--------Vector------------");
		    //Vector approach
		    Vector<Object> v1=new Vector<Object>();
		    v1.add(10);
		    v1.add("cyber");
		    v1.add("40");
		    v1.add(40);
		    v1.add(null);
		     ListIterator<Object> i3=v1.listIterator();
		    while(i3.hasNext())
		    {
		    	Object ii=i3.next();
		    	System.out.println(ii+ " ");
		    }    
	}

}
