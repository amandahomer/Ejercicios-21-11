/**Este programa ordena los tres numeros introducidos por teclado.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio13 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce tres numeros separados por un espacio: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int auxiliar;
		
		if (num1 > num2) {
			auxiliar = num1;
			num1 = num2;
			num2 = auxiliar;
		}
		if (num2 > num3) {
			auxiliar = num2;
			num2 = num3;
			num3 = auxiliar;
		}
		if (num1 > num2) {
			auxiliar = num1;
			num1 = num2;
			num2 = auxiliar;
		}
		
		System.out.print("Estos numeros de menor a mayor son: "+ num1 +", "+ num2 +" y "+ num3);
		
	}
}
