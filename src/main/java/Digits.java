import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    String a = Integer.toString(num);
		for(int i = 0; i < a.length()-1; i++)
			digitList.add(a.substring(i, i+1);
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitLIst.size()-1;i++)
			if(Integer.parseint(digitList.get(i+1)) > Integer.parseint(digitList.get(i)))
			   return true;
		return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
