package com.java;

import javax.swing.JOptionPane;

public class Main {
int num =0;
	public static void main(String[] args) {
		Object porcentaje = 10;
		Object cost1 = 120;
		Object cost2 = 130;
		
		  String output = String.format("El total es\s:\n")    + 
	                String.format("\s\s %d €\s(%s%%  IVA  no incl)\n", cost1, porcentaje) + 
	                String.format("\s\s %d €\s(con IVA incl)\n", cost2);
	                
	       
	        JOptionPane.showMessageDialog(null, output, "Ticket", JOptionPane.INFORMATION_MESSAGE);
	    
	       
}
}


//JOptionPane.showMessageDialog(null, "Yasmine","Java",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Yasmine", "Java",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showInputDialog(null, "Yasmine",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showOptionDialog(null, "Yasmine", null, 0, 0, null, args, args);
		//JOptionPane.showInputDialog("Yasmine");