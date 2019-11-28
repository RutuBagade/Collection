package list.comparable.css;

import java.util.Comparator;

public class ProdCast implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
	
		return p1.prodcast.compareTo(p2.prodcast);
	}

}
