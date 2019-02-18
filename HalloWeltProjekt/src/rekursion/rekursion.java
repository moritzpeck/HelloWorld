package rekursion;

public class rekursion {

	public static void main(String[] args) {
		ausgabe1(10000);

	}

	public static void ausgabe1(int zahl) {
		//das ist eine Rekursion
		//das ist eine Abbruchbedingung
		if (zahl==0)
			return;
		zahl = zahl / 3;
		System.out.println(zahl);
		//Rekursive Aufrufd
		ausgabe1(zahl);
	}

}
