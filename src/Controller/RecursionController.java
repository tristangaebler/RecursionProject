package Controller;

import Model.RecursionTool;
import View.RecursionFrame;

public class RecursionController {

	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	
	public void start() {
		
	}
	
	public RecursionController() {
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
}
