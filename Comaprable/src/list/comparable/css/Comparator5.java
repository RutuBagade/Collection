package list.comparable.css;

import java.util.Collections;
import java.util.Vector;

public class Comparator5 {

	public static void main(String[] args) {
		Vector<Product> p1=new Vector<Product>();
		p1.add(new Product(11,"Television","Electronics",15000.50));
		p1.add(new Product(89,"Pen","Generics",50.50));
		p1.add(new Product(555,"Headphones","Mobile",250.50));
		p1.add(new Product(11,"Led","Electronics",25000.50));
		p1.add(new Product(78,"Cellphones","Mobile",20000.50));
      //System.out.println(p1);
		//Collections.sort(p1, new ProdId());
		Collections.sort(p1, new ProdName());
		Collections.sort(p1, new ProdCast());
		for(Product pp:p1)
		{
			System.out.println(pp.prodid+"--"+pp.prodname+"--"+pp.prodcast+"--"+pp.prodcost);
		}
		
	}

}
