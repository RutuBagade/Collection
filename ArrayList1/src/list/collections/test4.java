package list.collections;
import java.util.ArrayList;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<movies> al=new ArrayList<movies>();
    al.add(new movies(1,"War"));
    al.add(new movies(2,"hero"));
    al.add(new movies(3,"joker"));
    al.add(new movies(4,"sky is pink"));
    for(movies m1:al)
    {
    	System.out.println(m1.moviescreennum+ "--"+m1.moviescreename);
    }

	}

}
