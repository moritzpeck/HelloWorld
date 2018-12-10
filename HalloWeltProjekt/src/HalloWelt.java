
public class HalloWelt {

	public static void main(String[] args) {
		System.out.println("Hallo Win 18 19! Mein Name ist Moritz!");
		System.out.println("1");
		System.out.println(1);
		System.out.println(1 + 1);
		System.out.println("1+1");
		System.out.println(9 / 4);
		System.out.println(9 / 4.0);
		boolean booleanVariable = true;
		System.out.println(booleanVariable);
		// geht nur einmal
		// boolean booleanVariable=false;
		// aber Werte können mehrfach zugewiesen werden
		booleanVariable = false;
		System.out.println(booleanVariable);
		//
		// 8 bit - -128..127
		byte byteVariable = 71;
		System.out.println(byteVariable);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//
		char charVariable = 'x';
		System.out.println(charVariable);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		//
		String stringVariable = "stringWert";
		System.out.println(stringVariable);
		System.out.println(stringVariable.length());
		System.out.println(stringVariable.charAt(5));
		//
		//Zahlen
		//short - 16bit - 32.768...32.767
		short shortVariable = 236;
		System.out.println(shortVariable);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//int - 32bit
		int intVariable = 2345678;
		System.out.println(intVariable);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//long 64 bit
		long longVariable = 1234567890;
				System.out.println(longVariable);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE); 
		//float 32bit
	float floatVariable = 123.456F;
	System.out.println(floatVariable);
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
	//double 64bit
	double doubleVariable = 123.4567890;
	System.out.println(doubleVariable);
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	// bei double hat man doppelte Genauigkeit

	}
}
