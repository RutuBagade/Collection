package list.comparable.css;

import java.util.ArrayList;
import java.util.Collections;

public class comparable1 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a1=new ArrayList<Character>();
		a1.add('A');
		a1.add('z');
		a1.add('c');
		a1.add('C');
		System.out.println(a1);
		Collections.sort(a1,Collections.reverseOrder());//descending order
		System.out.println(a1);
		ArrayList<Float> a12=new ArrayList<Float>();
		a12.add(10.5f);
		a12.add(8.5f);
		a12.add(12.5f);
		a12.add(100.5f);
		System.out.println(a12);
		Collections.sort(a12);//Ascending order
		Collections.sort(a12,Collections.reverseOrder());//descending order
		System.out.println(a12);
		ArrayList<Integer> a11=new ArrayList<Integer>();
		a11.add(10);
		a11.add(200000);
		a11.add(300);
		a11.add(40500);
		System.out.println(a11);
		Collections.sort(a11,Collections.reverseOrder());//Ascending order
		System.out.println(a11);
		ArrayList<String> a111=new ArrayList<String>();
		a111.add("hii");
		a111.add("rutu");
		a111.add("sai");
		a111.add("pooja");
		System.out.println(a111);
		Collections.sort(a111);//Ascending order
		System.out.println(a111);
		
	}

}
