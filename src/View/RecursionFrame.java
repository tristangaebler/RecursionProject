package View;

import javax.swing.JFrame;

import Controller.RecursionController;
import Model.CodeTimer;

public class RecursionFrame extends JFrame {
	private RecursionController baseController;
	private CodeTimer baseTimer;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController, CodeTimer baseTimer) {
		
		this.baseController = baseController;
		this.baseTimer = baseTimer;
		basePanel = new RecursionPanel(baseController, baseTimer);
		setupFrame();
	}

	
	private void setupFrame() {
		this.setContentPane(basePanel);
		this.setTitle("Lets Recurse");
		this.setSize(500,500);
		this.setVisible(true);
	}
}
