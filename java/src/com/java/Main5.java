package com.java;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;


		public class Main5 {
		    public static void main(String[] args) {
		        // Creamos un ArrayList para almacenar las frases
		        ArrayList<String> frases = new ArrayList<>();

		        // Agregamos algunas frases al ArrayList
		        frases.add("Te gusta la pizza con piña?");
		        frases.add("te gusta un bocadillo vegetal?");
		        frases.add("Te gusta un panini?");
		        frases.add("te gusta una ensalada de verduras?");
		        frases.add("te gusta una tostadita de pavo?");

		        // Creamos un array de iconos personalizados (en este caso, usaremos ImageIcons)
		        ImageIcon[] icons = {
		                new ImageIcon("sandwich.png"),
		                new ImageIcon("pizza.png"),
		                new ImageIcon("panini.png"),
		                new ImageIcon("ensalada.png"),
		                new ImageIcon("tostadita.png")
		             
		        };

		        // Creamos un array de textos para los botones personalizados
		        String[] buttonTexts = {
		                "si,me encanta",
		                "no,no me gusta",
		                "otra cosa porfa",
		                "siguiente",
		                "salir"
		        };

		        // Generamos un número aleatorio para obtener una frase al azar del ArrayList
		        Random random = new Random();

		        // Ciclo infinito para mostrar frases y botones personalizados continuamente
		        while (true) {
		            int indiceAleatorio = random.nextInt(frases.size());
		            String fraseAleatoria = frases.get(indiceAleatorio);
		            int indiceIconoOrdenado = random.nextInt(icons.length);
		            int indiceTextoBotonAleatorio = random.nextInt(buttonTexts.length);

		            int indiceIconoAleatorio = 0;
					int indiceIconoAleatorio1 = 0;
					// Creamos el JOptionPane personalizado con la frase, el icono y los botones personalizados
		            int selectedOption = JOptionPane.showOptionDialog(
		                    null, // El componente padre; si es null, se colocará en el centro de la pantalla.
		                    fraseAleatoria, // El mensaje a mostrar (la frase aleatoria)
		                    "Título del cuadro de diálogo", // El título del cuadro de diálogo
		                    JOptionPane.DEFAULT_OPTION, // Tipo de opciones (DEFAULT_OPTION para mostrar los botones personalizados)
		                    JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje (usamos PLAIN_MESSAGE para que no haya ícono predeterminado)
		                    icons[indiceIconoAleatorio1], // El ícono personalizado (aleatorio)
		                    buttonTexts, // El array de textos para los botones personalizados
		                    buttonTexts[indiceTextoBotonAleatorio] // El texto del botón predeterminado (aleatorio)
		            );
		            Object indiceIcono = (indiceIcono + 1) % icons.length;
		            indiceTextoBoton = (indiceTextoBoton + 1) % buttonTexts.length;
		            indiceFrase = (indiceFrase + 1) % frases.size();

		      
		        }
		    }
		}


