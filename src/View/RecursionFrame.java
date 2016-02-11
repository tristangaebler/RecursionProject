package View;

import javax.swing.JFrame;

import Controller.RecursionController;

public class RecursionFrame extends JFrame {
	private RecursionController baseController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController) {
		
		this.baseController = baseController;
		basePanel = new Recursion(baseController);
	}

	
	private void setupFrame() {
		
	}
}
