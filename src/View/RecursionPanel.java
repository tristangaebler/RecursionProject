package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(displayArea);
		this.setBackground(Color.BLUE);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		displayArea.setEditable(false);
		displayArea.setText(baseController.getCalcVal());
		
	}
	
	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 0, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 12, SpringLayout.EAST, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 98, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 88, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 74, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -22, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayArea, -24, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -19, SpringLayout.NORTH, displayArea);
	}
	
	private void setupListeners() {
		fibonacciButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click) {
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					displayArea.setText(baseController.doFibonacci(userInput));
				}
			}
		});
		
		factorialButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click) {
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					displayArea.append(baseController.doFactorial(userInput));
				}
			}
		});
	}
	

	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
			
		} 
		catch(Exception numException)
		{
			displayArea.setText("Type in a number");
		}
		
		return isNumber;
	}
}










