/**Este programa es un minicuestionario de las asignaturas del curso, cada una vale
*un punto y al final se muestra el resultado obtenido.
*Amanda*/

public class Ejercicio12 {

	public static void main (String [] args) {
		
		int puntos = 0;
		String solucion;
		
		System.out.println("Cuestionario sobre introducción a Java:");
		System.out.println("1. Java surgió en 1991 pero no pasó a llamarse Java hasta el año:");
		System.out.println("a) 2000		b) 1993		c) 1995");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("c")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("2. Para el desarrollo de programas en lenguaje Java es necesario utilizar un entorno de desarrollo denominado JRK.");
		System.out.println("a) Verdadero		b) Falso");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("3. El entorno de desarrollo de Java consta de:");
		System.out.println("a) Compilador	 b) Compilador y entorno ejercucion	 c) Interprete ");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("4. En Java, los datos y el código se combinan en entidades llamadas objetos.");
		System.out.println("a) Verdadero		b) Falso");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("5. Una vez escrito el código fuente es precompilado generándose los códigos Bytecodes, con extension:");
		System.out.println("a) .java		b) .class		c) .byte");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("6. Bytecode: Son un conjunto de instrucciones en lenguaje máquina que no son específicas a ningún procesador.");
		System.out.println("a) Verdadero		b) Falso");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("a")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("7. Todos los programas han de incluir una clase como esta:");
		System.out.println("a) Public void		b) Public class		c) Public java");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("8. El nombre del fichero que contiene el código fuente de nuestro programa,"); 
		System.out.println("no coincidirá con el nombre de la clase que estamos describiendo en las líneas del mismo.");
		System.out.println("a) Verdadero		b) Falso");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("9. La compilación de aplicaciones se realiza mediante el programa _____ incluido en el software de desarrollo de Java.");
		System.out.println("a) javacomp		b) JVM		c) javac");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("c")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.println("10. La herramienta básica para empezar a desarrollar aplicaciones en Java es: ");
		System.out.println("a) JVM		b) JDK		c) JRE");
		System.out.println("La solucion es: ");
		solucion = System.console().readLine();
		if (solucion.equals("b")) {
			puntos++;
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
		System.out.print("Tu puntuacion es: "+ puntos +"/10.");
	
	}
}
