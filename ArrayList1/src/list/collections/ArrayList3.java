package list.collections;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		//normal version
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('B');
		a.add(30);
		a.add(null);
		a.add(10);
		System.out.println(a);
        //Generics Version
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("D");
		a1.add("C");
		a1.add("A");
		a1.add(null);
		System.out.println(a1);
		
	}

}
