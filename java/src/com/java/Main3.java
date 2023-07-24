package com.java;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main3 {

	public static <string> void main(String[] args) {
		
		 String[] animales = {
				    "Lobo",
		            "Gato",
		            "Perro",
		            "Leon",
		        };
	
		        String main = (String) JOptionPane.showInputDialog(null, "cual es tu animal favorito", "Animales", JOptionPane.DEFAULT_OPTION, null, animales, animales[0]);
				 ImageIcon customIcon = new ImageIcon("lobo.png");

			        // Mostramos el JOptionPane personalizado con el ícono personalizado
			        JOptionPane.showMessageDialog(
			                null, // El componente padre; si es null, se colocará en el centro de la pantalla.
			                "Lobo",// El mensaje a mostrar
			                "Animal", // El título del cuadro de diálogo
			                JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje (usamos PLAIN_MESSAGE para que no haya ícono predeterminado)
			                customIcon // El ícono personalizado
			        );
			       
			    }
			}
			






   

