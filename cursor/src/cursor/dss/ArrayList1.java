package cursor.dss;

import java.util.ArrayList;
//insertion order is maintained
//non-synchronized
//null insertion is allowed
//duplicates are allowed
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
        al.add(40);
        System.out.println(al);
        al.add(40.5f);
        al.add(true);
        al.add('a');
        al.add("cyber");
        al.add(10);
        al.add(null);
        System.out.println(al);
	}

}
