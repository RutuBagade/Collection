package list.comparable.css;

import java.util.Comparator;

public class ProdName implements Comparator {

	
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return -(p1.prodname.compareTo(p2.prodname));//Descending order
	}
     /*
      * ----------------------------------
      public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return (p1.prodname.compareTo(p2.prodname));
	}
	output:
	78--Cellphones--Mobile--20000.5
	555--Headphones--Mobile--250.5
	11--Led--Electronics--25000.5
	89--Pen--Generics--50.5
	11--Television--Electronics--15000.5
	---------------------------------------
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return (p2.prodname.compareTo(p1.prodname));
	}
	output:
	11--Television--Electronics--15000.5
	89--Pen--Generics--50.5
	11--Led--Electronics--25000.5
	555--Headphones--Mobile--250.5
	78--Cellphones--Mobile--20000.5
	
      */
}
