package otracosa;

public class Constantes {

	public static void main(String[] args) {
	        final byte MI_BYTE = 120;
	        final short MI_SHORT = 30000;
	        final int MI_INT = 2000000000;
	        final long MI_LONG = 9000000000000000000L;

	        // Desbordamiento para byte (5 posiciones)
	        byte byteDesbordado = (byte) (MI_BYTE + 5);
	        System.out.println("Byte: " + byteDesbordado);

	        // Desbordamiento para short (25 posiciones)
	        short shortDesbordado = (short) (MI_SHORT + 25);
	        System.out.println("Short: " + shortDesbordado);

	        // Desbordamiento para int (10000 posiciones)
	        int intDesbordado = MI_INT + 10000;
	        System.out.println("Int: " + intDesbordado);

	        // Desbordamiento para long (20000 posiciones)
	        long longDesbordado = MI_LONG + 20000L;
	        System.out.println("Long: " + longDesbordado);
	    
	}

}
