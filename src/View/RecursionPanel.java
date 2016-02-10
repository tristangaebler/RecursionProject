package View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Controller.RecursionController;

public class RecursionPanel extends JPanel {

	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController) {
		
		this.baseController = baseController();
		fibonacciButton = new JButton();
		factorialButton = new JButton();
		inputField = new JTextField();
		displayArea = new JTextArea();
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() {
		
	}
	
	private void setupLayout() {
		
	}
	
	private void setupListeners() {
		
	}
	
	
}
