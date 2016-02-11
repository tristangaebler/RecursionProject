package View;

import java.awt.Color;

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
		
		this.baseController = baseController;
		fibonacciButton = new JButton("Get the fib number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		displayArea = new JTextArea(10, 20);
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(fibonacciButton, factorialButton);
		this.add(inputField);
		this.add(displayArea);
		this.setBackground(Color.BLUE);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
	}
	
	private void setupLayout() {
		
	}
	
	private void setupListeners() {
		
	}
	
	
}
