package list.collections;
import java.util.ArrayList;
public class test2 {

	//Generics concept
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(null);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
     System.out.println(al);
     al.clear();
     System.out.println(al);
	}
}
