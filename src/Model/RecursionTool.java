package Model;

public class RecursionTool
{
	public int getFibNum(Integer position)
	{
		//Defensive code
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		//This is the base case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //Recursive case
		{
			return getFibNum(position - 1) + getFibNum(position - 2);
		}	
	}
	
	public int getFactorial(int position) {
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0) {
			return 1;
		}
		else
		{
			return position * getFactorial(position - 1);
		}
	}
}
