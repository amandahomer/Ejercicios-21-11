/**Este programa muestra por pantalla el horoscopo a partir del
*dia y la fecha de nacimiento.
*AmandaNR*/
import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el dia y el mes de nacimiento (1-12), seguidos de un espacio: ");
		int dia = s.nextInt();
		int mes = s.nextInt();
		
		String horoscopo;
		switch (mes) {
			case 1:
				if (dia <= 21) {
					horoscopo = "Capricornio";
				} else {
					horoscopo = "Acuario";
				}
				break;
			case 2:
				if (dia <= 18) {
					horoscopo = "Acuario";
				} else {
					horoscopo = "Piscis";
				}
				break;
			case 3:
				if (dia <= 20) {
					horoscopo = "Piscis";
				} else {
					horoscopo = "Aries";
				}
				break;
			case 4:
				if (dia <= 19) {
					horoscopo = "Aries";
				} else {
					horoscopo = "Tauro";
				}
				break;
			case 5:
				if (dia <= 20) {
					horoscopo = "Tauro";
				} else {
					horoscopo = "Geminis";
				}
				break;
			case 6:
				if (dia <=20) {
					horoscopo = "Geminis";
				} else {
					horoscopo = "Cancer";
				}
				break;
			case 7:
				if (dia <=22) {
					horoscopo = "Cancer";
				} else {
					horoscopo = "Leo";
				}
				break;
			case 8:
				if (dia <=22) {
					horoscopo = "Leo";
				} else {
					horoscopo = "Virgo";
				}
				break;
			case 9:
				if (dia <=22) {
					horoscopo = "Virgo";
				} else {
					horoscopo = "Libra";
				}
				break;
			case 10:
				if (dia <=22) {
					horoscopo = "Libra";
				} else {
					horoscopo = "Escorpio";
				}
				break;
			case 11:
				if (dia <=22) {
					horoscopo = "Escorpio";
				} else {
					horoscopo = "Sagitario";
				}
				break;
			case 12:
				if (dia <=20) {
					horoscopo = "Sagitario";
				} else {
					horoscopo = "Capricornio";
				}
				break;
			default:
				horoscopo = "Introduce datos correctos.";
			}
			
	System.out.println("Tu horoscopo es "+ horoscopo);
		
		}
	}
