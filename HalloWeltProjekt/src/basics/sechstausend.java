package basics;

public class sechstausend {
public static void main(String[] args) {
		
int j = 0;
		for (int i = 1; i <= 1000; i = i + 1) {
			if ((i % 6)==0)
			j++;
		}		
			System.out.println("es gibt " + j + " Zahlen die durch 6 teilbar sind von 0-1000");
		
	}
}



