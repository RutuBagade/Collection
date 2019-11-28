package list.comparable.css;

import java.util.Comparator;

public class Empsalarysort implements Comparator<Emp1>
{
  public int compare(Emp1 e1,Emp1 e2)
	{
		if(e1.empsalary==e2.empsalary)
		{
			return 0;
		}
		else if(e1.empsalary>e2.empsalary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		/*
		 sorting according to desceding order
		 if(e1.empsalary==e2.empsalary)
		{
			return 0;
		}
		else if(e1.empsalary<e2.empsalary)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		 */
	}

	

}
