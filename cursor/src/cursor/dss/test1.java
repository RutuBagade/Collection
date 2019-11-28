package cursor.dss;
import java.util.Enumeration;
import java.util.Vector;
public class test1 {

	public static void main(String[] args) {
		//normal approach
     Vector v1=new Vector();
     v1.add(10);
     v1.add(20);
     v1.add(null);
     v1.add("cyber");
     v1.add(10);//duplicate are allowed
     Enumeration e= v1.elements();
      while(e.hasMoreElements())
      {
    	Object o= (Object) e.nextElement();
    	System.out.println(o);
      }
      //Generics approach
      Integer i;
      Vector<Integer> al=new Vector<Integer>();
      for(i=1;i<=10;i++)
      {
    	  al.add(i);
      }
      Enumeration<Integer> e1=al.elements();
      while(e1.hasMoreElements())
      {
    	  Integer i1=e1.nextElement();
    	  System.out.print(i1+" ");
      }
      
	}

}
