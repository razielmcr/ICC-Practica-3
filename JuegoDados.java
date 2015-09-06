import java.util.Scanner;
import java.util.Random;									//importar par hacer aleatorios los enteros

/**
 * Programa para simular el juego de dados entre la persona y la computadora
 * Se tiran dos veces los dados por participante y el resultado de los dados se multiplica
 * El ganador es aquel con el resultado mayor
 * @author ALmanza Ibarra Raziel
 * @version 1.0 
 * @date 9/5/15
 **/

public class JuegoDados{


    public static void main(String[] pps) {
	/*Objeto de la clase Random para implementación de métodos*/
	Random Dado_dadito = new Random();	
	/**Variable tirada que tiene como valor un número entero
	*con rango del 1 al 6 haciendo llamada al método nextInt
	*del objeto r de la clase Random*/
	
	//Variables enteras que tendrán un valor diferente a la misma operación random
	int tirada1 = Dado_dadito.nextInt((6 - 1) + 1) + 1;
	int tirada2 = Dado_dadito.nextInt((6 - 1) + 1) + 1;
	int tirada3 = Dado_dadito.nextInt((6 - 1) + 1) + 1;
	int tirada4 = Dado_dadito.nextInt((6 - 1) + 1) + 1;
	int producto1 = tirada1 * tirada2;						//Los productos de las tiradas obtenidos(Usuario)
	int producto2 = tirada3 * tirada4;						//Productos de la computadora
	String nombreUsuario;		

	// Pedir al usuario su nombre 
	Scanner in = new Scanner (System.in);
	System.out.println("Juego de Dados \n------------------- \nEscribe tu nombre: ");
	nombreUsuario = in.nextLine();							//recoge nombre

	// Pedir al usuario que tire su dado (sólo debe dar ENTER)
	System.out.println("Tira tu primer dado (pulsa enter)");
	while(!in.nextLine().equals(""));						//solo continua si hay espacio en blanco en la línea
	int resultado1 = tirada1;								//asigna un valor aleatorio
	System.out.println("Obtienes un: " +resultado1);

	// Pedir al usuario que tire otra vez su dado (sólo debe dar ENTER)
	System.out.println("Tira tu segundo dado (pulsa enter)");
	while(!in.nextLine().equals(""));						//solo continua si hay espacio en blanco en la línea
	int resultado2 = tirada2;								//asigna un segundo valor aleatorio	
	System.out.println("Obtienes un: " +resultado2);

	// Calcular su producto
	System.out.println("\n\tEl producto de tus dados es: " + producto1);

	// Hacer la computadora tire dos veces su dado y calcular su producto

	int resultado3 = tirada3;								//asigna un valor aleatrio
	int resultado4 = tirada4;								//segundo valor aleatorio
	System.out.println("La tirada de la computadora es" + "\nDado 1: " + resultado3 + "\nDado 2: " + resultado4);
	System.out.println("\nY su producto es: " + producto2);

	// Determinar el ganador, esto es determinar quien tiene el producto mayor
	if (producto1 > producto2){								//condicional donde si el usuario es mayor, gana
		System.out.println("\n\tGANO " + nombreUsuario);
	}else{
		System.out.println("\n\tGANO COMPUTADORA");			//en cualquier otro caso, la computadora gana.
	}

    } //end main
}// end class
