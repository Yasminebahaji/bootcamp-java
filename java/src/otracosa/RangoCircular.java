package otracosa;

public class RangoCircular {

	public static void main(String[] args) {
		byte miByte = 120;
		short miShort = 30000;
		int miInt = 2000000000;
		long miLong = 9000000000000000000L;

		// Desbordamiento para byte (5 posiciones)
		miByte = (byte) (miByte + 5);
		System.out.println("Byte: " + miByte);

		// Desbordamiento para short (25 posiciones)
		miShort = (short) (miShort + 25);
		System.out.println("Short: " + miShort);

		// Desbordamiento para int (10000 posiciones)
		miInt = miInt + 10000;
		System.out.println("Int: " + miInt);

		// Desbordamiento para long (20000 posiciones)
		miLong = miLong + 20000L;
		System.out.println("Long: " + miLong);

	}

}
