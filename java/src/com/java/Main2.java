package com.java;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		String output = String.format("Queue Operations Menu \n")    + 
                String.format("1.Insert\n") + 
                String.format("2.Delete\n")+
                String.format("3.Display\n")+
                String.format("4.Exit\n\n")+
		        String.format("Enter your option");
                
        JOptionPane.showInputDialog(null, output, "Ticket", JOptionPane.QUESTION_MESSAGE);
	
	}
}
