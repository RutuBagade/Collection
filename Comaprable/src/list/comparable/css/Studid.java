package list.comparable.css;
import java.util.Comparator;

public class Studid implements Comparator<Student>
{
	public int compare(Student s1,Student s2) {
		if(s1.studid==s2.studid)
		{
			return 0;
		}
		else if(s1.studid>s2.studid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		// sorting according to desending order
		/*
		 * 
		 * if(s1.studid==s2.studid)
		{
			return 0;
		}
		else if(s1.studid<s2.studid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		 * */
		
	}
}
