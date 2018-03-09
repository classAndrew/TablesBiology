package me.andrew.types;

import javax.swing.JLabel;
import javax.swing.JTextField;

import me.andrew.tablefactory.TableFactory;

public class Percentage {

	// Instance vars
	public static JTextField textFieldBuffer;
	private float floatingPoint;
	private String[] stringArray;
	
	private boolean rounded;
	
	public Percentage(float floatingPoint, boolean rounded){
		this.floatingPoint = floatingPoint;
		this.rounded = rounded;
		stringArray = makeStringArray();
	}
	
	// Alternative constructors
	
	public Percentage(String dividend, String divisor, boolean rounded){
		this.floatingPoint = Float.valueOf(dividend) / Float.valueOf(divisor);
		this.rounded = rounded;
		stringArray = makeStringArray();
	}
	
	public Percentage(JLabel lbl, boolean rounded){
		this.floatingPoint = Float.valueOf(lbl.getText()) / Float.valueOf(textFieldBuffer.getText());
		this.rounded = rounded;
		stringArray = makeStringArray();
	}
	
	public String getPercentAsString(){
		String firstPart, secondPart;
		firstPart = stringArray[2];
		secondPart = stringArray[3];
		
		// Rounding
		
		if (rounded) {
			int secondInt = Integer.valueOf(secondPart);
			if (secondInt >= 5 && secondInt != 9){
				secondPart = String.valueOf(secondInt + 1);
			}
		}
		
		if (firstPart.equals("0")) {
			firstPart = "";
		}
			
		return firstPart + secondPart + "%";
	}
	
	private String[] makeStringArray(){
		return String.valueOf(floatingPoint).split("");
	}
	
}
