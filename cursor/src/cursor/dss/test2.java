package cursor.dss;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Iterator;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist approach
		System.out.println("--------ArrayList------------");
    ArrayList<String> al=new ArrayList<String>();
    al.add("cyber");
    al.add("success");
    al.add("software");
    al.add("training");
    Iterator<String> i1=al.iterator();
    while(i1.hasNext())
    {
    	String s=i1.next();
    	System.out.println(s+ " ");
    }
    System.out.println("--------LinkedList------------");
    //linkedlist approach
    LinkedList<Integer> l1=new LinkedList<Integer>();
    l1.add(10);
    l1.add(20);
    l1.add(30);
    l1.add(40);
    l1.add(null);
    Iterator<Integer> i2=l1.iterator();
    while(i2.hasNext())
    {
    	Integer i=i2.next();
    	System.out.println(i+ " ");
    }    
    System.out.println("--------Vector------------");
    //linkedlist approach
    Vector<Object> v1=new Vector<Object>();
    v1.add(10);
    v1.add("cyber");
    v1.add("40");
    v1.add(40);
    v1.add(null);
    Iterator<Object> i3=v1.iterator();
    while(i3.hasNext())
    {
    	Object ii=i3.next();
    	System.out.println(ii+ " ");
    }    
	}

}
