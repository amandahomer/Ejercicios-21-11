/**Este programa muestra los segundos q faltan hasta media noche
*dependiendo de la hora introducida.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio11 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduce la hora y los minutos seguidos de un espacio: ");
		int hora = s.nextInt();
		int minutos = s.nextInt();
		
		int segundos = (hora * 3600) + (minutos * 60);
		int segMediaNoche = (24 * 3600) - segundos;
		
		System.out.println("Faltan "+ segMediaNoche +" segundos para la medianoche.");
		
	}
}
