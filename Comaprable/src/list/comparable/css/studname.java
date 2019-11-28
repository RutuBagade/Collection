package list.comparable.css;

import java.util.Comparator;

public class studname implements Comparator<Student>
{
	public int compare(Student s1,Student s2) {
		return -((s1.studname).compareToIgnoreCase(s2.studname));
	}

	// sort the studname in ascending orders
	/* int compare(Student s1,Student s2) {
		return ((s1.studname).compareToIgnoreCase(s2.studname));
	}*/
}
