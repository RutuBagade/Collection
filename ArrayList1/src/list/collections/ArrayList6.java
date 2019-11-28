package list.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.TreeSet;

public class ArrayList6 {

	public static void main(String[] args) 
	{
		ArrayList<StringBuffer> a1=new ArrayList<StringBuffer>();
		a1.add(new StringBuffer("Akash"));
		a1.add(new StringBuffer("Monika"));
		a1.add(new StringBuffer("Babita"));
		a1.add(new StringBuffer("Tillu"));
		a1.add(new StringBuffer("Nikita"));
		System.out.println(a1);
		Collections.sort(a1, new Myclass1());
		System.out.println(a1);
	}

}
 class Myclass1 implements Comparator<StringBuffer>
{
	public int compare(StringBuffer s1, StringBuffer s2) {
		// TODO Auto-generated method stub
		return -s1.toString().compareTo(s2.toString());
}
	}
