package com.java;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Main6 {

	public static void main(String[] args) {
		
		        // Creamos un ArrayList para almacenar las frases
		        List<String> frases = new ArrayList<>();

		        // Agregamos algunas frases al ArrayList
		        frases.add("Te gusta la pizza con piña?");
		        frases.add("te gusta un bocadillo vegetal?");
		        frases.add("Te gusta un panini?");
		        frases.add("te gusta una ensalada de verduras?");
		        frases.add("te gusta una tostadita de pavo?");

		        // Creamos un array de iconos personalizados (en este caso, usaremos ImageIcons)
		        ImageIcon[] icons = {
		                new ImageIcon("pizza.png"),
		                new ImageIcon("sandwich.png"),
		                new ImageIcon("panini.png"),
		                new ImageIcon("salad.png"),
		                new ImageIcon("tostada.png"),
		                
		        };

		        // Creamos un array de textos para los botones personalizados
		        String[] buttonTexts = {
		                "Si, me encanta",
		                "No, no me gusta",
		                "Otra cosa",
		                "Siguiente",
		                "Salir"
		        };

		        // Índices para llevar un seguimiento de la posición actual en los arrays
		        int indiceIcono = 0;
		        int indiceTextoBoton = 0;
		        int indiceFrase = 0;

		        // Ciclo para mostrar frases y botones personalizados
		        while (true) {
		            // Obtenemos la frase actual
		            String fraseActual = frases.get(indiceFrase);

		            // Creamos el JOptionPane personalizado con la frase, el icono y los botones personalizados
		            int selectedOption = JOptionPane.showOptionDialog(
		                    null,fraseActual, "Comida", 
		                    JOptionPane.DEFAULT_OPTION,
		                    JOptionPane.PLAIN_MESSAGE, 
		                    icons[indiceIcono], 
		                    buttonTexts, 
		                    buttonTexts[indiceTextoBoton] 
		            );
		            System.out.println(selectedOption);

		            // Incrementamos los índices para que cambien los iconos y los textos de los botones en orden
		            
		            indiceIcono = (indiceIcono + 1) % icons.length;
		            indiceTextoBoton = (indiceTextoBoton + 1) % buttonTexts.length;
		            indiceFrase = (indiceFrase + 1) % frases.size();
		        }
		    }
		}



