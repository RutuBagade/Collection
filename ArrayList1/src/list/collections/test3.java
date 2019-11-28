package list.collections;
import java.util.ArrayList;
public class test3 {

	//Generics concept
	public static void main(String[] args) {
		//normal approach
		ArrayList al=new ArrayList();//heterogeneous values
		al.add(null);
		al.add(10);
		al.add("20");
		al.add(30);
		al.add("cyber");
     System.out.println(al);
     //generic approach
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(null);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
     System.out.println(al);
     }
}
