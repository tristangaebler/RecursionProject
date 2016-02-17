package Controller;

import Model.RecursionTool;
import View.RecursionFrame;
import Model.CodeTimer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class RecursionController {

	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calcVal;
	private CodeTimer time;
	
	public void start() {
		time.startTimer();
		calcVal = Integer.toString(mathTool.getFibNum(0));
		time.stopTimer();
		time.toString();	
	}
	
	public RecursionController() {
		mathTool = new RecursionTool();
		time = new CodeTimer();
		baseFrame = new RecursionFrame(this, time);
	}
	
	public String getCalcVal() {
		return calcVal;
	}
	
	public String doFibonacci(String input) {
		
		calcVal ="The fibonacci sequence number of " + input + " is " + Integer.toString(mathTool.getFibNum(Integer.parseInt(input)));
		
		return calcVal;
	}
	
	public String doFactorial(String input) {
		calcVal = "The factorial of " + input + "is " + Double.toString(mathTool.getFactorial(Double.parseDouble(input)));
		
		return calcVal;
	}
	
	
	
	

}
