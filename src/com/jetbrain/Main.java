package com.jetbrain;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	String Binary;

	JOptionPane.showMessageDialog(null,"Welcome to the application.","Welcome",JOptionPane.INFORMATION_MESSAGE);

	if (JOptionPane.showConfirmDialog(null, "Would you like to start converting?", "Confirmation",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

		do {
			Binary = JOptionPane.showInputDialog("Input Binary Number: "); //Allows input of binary string in pop-up box.
			if (!(Binary != null))
			{JOptionPane.showMessageDialog(null,"Conversion has ended.","Termination",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0); }
			if (Binary.matches("[01]+"))  //Checks if input is binary.

				JOptionPane.showMessageDialog(null, "Output Decimal Format: " + Integer.parseInt(Binary, 2), "Decimal Output", JOptionPane.INFORMATION_MESSAGE); //Outputs the decimal value of the binary string.

			else {

				do { //Loop to repeat asking for input if the input is not in binary format.
					JOptionPane.showMessageDialog(null, "The string is not entered in binary format.", "Incorrect Input", JOptionPane.WARNING_MESSAGE);
					Binary = JOptionPane.showInputDialog("Input Binary Number: ");
					if (!(Binary != null))
					{JOptionPane.showMessageDialog(null,"Conversion has ended.","Termination",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);}
				} while (!(Binary.matches("[01]+"))); // End of loop saying condition that will allow the loop to continue.

				JOptionPane.showMessageDialog(null, "Output Decimal Format: " + Integer.parseInt(Binary, 2), "Decimal Output", JOptionPane.INFORMATION_MESSAGE); //Outputs the decimal value of the binary string.
			}

		} while (JOptionPane.showConfirmDialog(null, "Would you like to continue converting?", "Confirmation",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "The conversion has ended", "Termination", JOptionPane.INFORMATION_MESSAGE);
	}
	else
		JOptionPane.showMessageDialog(null, "The conversion has ended", "Termination", JOptionPane.INFORMATION_MESSAGE);
    }
}