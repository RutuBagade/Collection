package cursor.dss;
import java.util.ArrayList;
import java.util.Iterator;
//Remove element by using iterator cursor
public class test5 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("bullet");
		al.add("shine");
		al.add("splender");
        al.add("herohonda");
        al.add("activa");
        al.add("bullet");
        System.out.println(al);
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			if(s.equals("bullet"))
				i.remove();
		}
		System.out.println(al);
		
	}

}
