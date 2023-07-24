package com.java;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main4 {

	public static void main(String[] args) {
		 ImageIcon customIcon = new ImageIcon("pizza.png");
		
		 Object[] options = {"si,me encanta"," No","Prefiero de 4 quesos", "siguiente","Salir"};
		
		   int selectedOption = JOptionPane.showOptionDialog(
	                null, // El componente padre; si es null, se colocará en el centro de la pantalla.
	                "Te gusta la piza con piña ?", // El mensaje a mostrar
	                "preguntas sobre comida", // El título del cuadro de diálogo
	                JOptionPane.YES_NO_CANCEL_OPTION, // El tipo de opciones (sí, no, cancelar)
	                JOptionPane.PLAIN_MESSAGE, // El ícono a mostrar
	                customIcon, // El ícono personalizado (puede ser null)
	                options, // El array de botones personalizados
	                options[0] // El botón predeterminado (opcional)
	        );
	}

}
