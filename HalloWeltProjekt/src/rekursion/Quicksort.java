package rekursion;

public class Quicksort {
	// globale Variable
		static int[] zahlen = { 9, 2, 5, 1, 7, 10, 6, 4, 3 };

		public static void main(String[] args) {
			for (int i=0;i < zahlen.length; i++) 
			//System.out.println("das ist eine unsortierte Zahl " );
			System.out.println(zahlen[i]+",");
			// ausgabe der unsortieren zahlen
			// sortieren mit quicksort
			// ausgabe der sortieren zahlen
		}

		public static void quicksort(int links, int rechts) {
			// abbruchbedingung ( bedingung
			// teiler = teile
			// 2x quicksort

		}

		public static int teile(int links, int rechts) {
			int i = links; // geändert!!
			int j = rechts - 1; // auch hier
			int pivot= zahlen[rechts];
			do {
				// Suche von links ein Element, welches größer als das Pivotelement ist
				while (i < rechts -1 && zahlen[i] < pivot) {
		          i= i+1; // code
				}
				//
				while (j > links && zahlen[i] >= pivot) {
					j= j-1;// code
				}
				//
				if (i < j) {
				int tausche = zahlen[i];
				zahlen[i]= pivot;// tausche
				}
			} while (i < j);
			//
			if (zahlen[i] > pivot) {
				int tausche = zahlen[i];
			zahlen[i] = zahlen[i + 1];
			zahlen[i + 1] = tausche;
			}
			//
			return i;
		}

	}