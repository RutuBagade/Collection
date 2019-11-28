package list.comparable.css;

import java.util.Comparator;

public class Studentclass implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.studclass==s2.studclass)
		{
			return 0;
		}
		else if(s1.studclass>s2.studclass)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		/*
		 *
		 if(s1.studclass==s2.studclass)
		{
			return 0;
		}
		else if(s1.studclass<s2.studclass)
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
