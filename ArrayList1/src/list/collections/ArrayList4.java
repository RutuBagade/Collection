package list.collections;

import java.util.ArrayList;

public class ArrayList4 
{
     public static void main(String[] args) 
     {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add("cyber");
		al.add('A');
		al.add(100);
		al.add(10);
		al.add(null);
		System.out.println(al);
        al.add(3,"suceess");
        for(Object oo:al)
        {
        	System.out.println(oo);
        }
	}

}
