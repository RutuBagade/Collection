package cursor.dss;
import java.util.ArrayList;
import java.util.Iterator;

public class test6 {

	public static void main(String[] args) {
		ArrayList<Book> book=new ArrayList<Book>();
		book.add(new Book(111,"Depth in c","yashwant kanetkar"));
		book.add(new Book(222,"Wings of fire","APG Abdul kalam"));
		book.add(new Book(333,"BlackWater",""));
		book.add(new Book(444,"Fastrack","Rajesh Warma"));
		//System.out.println(book);
		for(Book b1:book)
		{
			System.out.println(b1.Bookid+"--"+b1.Bookname+"-->"+b1.BookAuthor);
		}
		System.out.println("-----using iterator cursor-----------");
		Iterator<Book> i1=book.iterator();
		while(i1.hasNext())
		{
			Book b=i1.next();
			//System.out.println(b.Bookid+"--"+b.Bookname+"-->"+b.BookAuthor);
			if(b.Bookid==111)
				i1.remove();
			if(b.Bookname.equals("Fastrack"))
				i1.remove();
			//if(b.BookAuthor.equals(""))
				//i1.remove();
		}
		for(Book b1:book)
		{
			System.out.println(b1.Bookid+"--"+b1.Bookname+"-->"+b1.BookAuthor);
		}

	}

}
