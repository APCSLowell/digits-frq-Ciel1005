import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    String a = num + "";
		for(int i = 0; i < a.length()-1; i++)
			digitList.add(a.substring(i, i+1));
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitList.size()-1;i++)
			if(Integer.parseInt(digitList.get(i+1)) > Integer.parseInt(digitList.get(i)))
			   return true;
		return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
