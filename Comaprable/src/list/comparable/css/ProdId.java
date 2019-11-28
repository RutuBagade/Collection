package list.comparable.css;

import java.util.Comparator;

public class ProdId implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		if(p1.prodid==p2.prodid)
		{
		return 0;
	    }
		else if(p1.prodid>p2.prodid)
		{
		return 1;
	    }
		else
		{
			return -1;
		}
    /*
     if(p1.prodid==p2.prodid)
		{
		return 0;
	    }
		else if(p1.prodid<p2.prodid)
		{
		return 1;
	    }
		else
		{
			return -1;
		}
       output:
       555--Headphones--Mobile--250.5
		89--pen--Generics--50.5
		78--Cellphones--Mobile--20000.5
		11--Television--Electronics--15000.5
		11--Led--Electronics--25000.5

     */
}
}
