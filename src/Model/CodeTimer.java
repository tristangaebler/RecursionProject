package Model;

public class CodeTimer
{

	private long executionTime;
	
	public CodeTimer()
	{
		this.executionTime = 0;
		
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
		
	}
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	
	
	
}
