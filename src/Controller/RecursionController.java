package Controller;

import Model.RecursionTool;
import View.RecursionFrame;

public class RecursionController {

	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calcVal;
	
	public void start() {
		calcVal = Integer.toString(mathTool.getFibNum(0));
	}
	
	public RecursionController() {
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
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
