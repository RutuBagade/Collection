package list.collections;
import java.util.ArrayList;
public class test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("10");
		a.add("200");
		a.add("cyber");
		a.add("10.5f");
		a.add("success");
		a.add("10");//duplicate allowed
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.remove(5));
		System.out.println(a);
	}

}
