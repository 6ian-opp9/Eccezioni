import java.util.InputMismatchException;
import java.util.Scanner;
public class ProvaEccezioni {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);

		System.out.print("Inserire numero: ");
		int scelta = s1.nextInt();
		
		System.out.println(" ");
		
		switch (scelta) {
		
		case 1:
			
			int[] T = null;
			
			try {
				
				T [0] = 7;
			}
			
			catch (NullPointerException e){
				
				System.out.println(e.getMessage());
			}
			
			break;
			
		case 2:
			
			String s=null;
			
			try {
				
				int l = s.length();
			}
			
			catch (NullPointerException e) {
				
				System.out.println(e.getMessage());
			}
			
			break;
			
		case 3:
			
			int num = 0;
	
			try {
				
				System.out.print("Inserisci un numero: ");
				num = s1.nextInt();
			}

			catch (InputMismatchException f) {
				
				System.out.println(f.getMessage());
			}
			
			System.out.println(" ");
			
			int caso = (int) (Math.random() * 3);
			
			double result = 0.0;
			
			try {
				
				System.out.println("Il risultato è: " + num / caso); 
			}
			
			catch (ArithmeticException e){
				
				System.out.println(e.getMessage());
			}
			
			break;
		
		case 4:
			
			int vett [] = new int [5];
			
			try {
				
				 System.out.print("Inserisci la posizione del vettore: ");
				 int pos = s1.nextInt();
				 
				 System.out.print("Inserisci il valore da inserire in posizione " + pos + ": ");
				 int val = s1.nextInt();
				 
				 vett [pos] = val;
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage());
			}
			
			break;
			
		default: 
			
			System.out.println("Selezione errata.");
		
		}
	}
}
