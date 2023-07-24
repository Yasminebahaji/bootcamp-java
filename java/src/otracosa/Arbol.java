package otracosa;

public class Arbol {
		    public static void main(String[] args) {
		    	
		        int altura = 10; // Altura del árbol

		        // Bucle externo para controlar la altura del árbol
		        
		        for (int i =0; i < altura; i++) {
		            
		            // Bucle interno para imprimir los espacios en blanco antes de cada nivel del árbol
		        	
		            for (int j = 0; j < altura - i - 1; j++) {
		            	
		                System.out.print(" ");
		            }
		            
		            // Bucle interno para imprimir los asteriscos de cada nivel del árbol
		            
		            for (int k = 0; k < (2 * i + 2); k++) {
		                System.out.print("*");
		            }
		           
		            System.out.println(); // Salto de línea para pasar al siguiente nivel del árbol
		        }
		    }
	}


