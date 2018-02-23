// Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción

import java.util.Scanner;
/**
 * 
 * @author diego
 *
 */
public class TestAlmacen1 {
/**
 * metodo principal para el Almacen
 * @param argv no sirve para nada
 */
	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		Scanner sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();
		
	}
	/**
	 * Muestra el menu
	 */

	static void mostrarMenu() {
		System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opción:[1-6]:");
	}

	// Procesa la opción introducida operando sobre el objeto Almacen1
	/**
	 * Procesa la opcion que hemos seleccionado
	 * @param opcion selecciona la opcion que quieres hacer
	 * @param parAlmacen Hace referencia a nuestro almacen
	 */
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		Scanner sc = new Scanner(System.in);

		// Completar......

		switch (opcion) {
		case 1:
			System.out.println("El contenido del Almacén es:"+ parAlmacen.toString());
			break;
		case 2:
			System.out.println("Introduzca un número:");
			int num = sc.nextInt();
			parAlmacen.ponValor(num);
			break;
		case 3:
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			parAlmacen.estaValor(num);
			break;
		case 4:
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			parAlmacen.sacarValor(num);
			break;
		case 5:
			System.out.println(" Posiciones ocupadas = " +  parAlmacen.numPosicionesOcupadas());
			break;

		case 6:
		  System.out.println(" Posiciones libres = " +  parAlmacen.numPosicionesLibres());
		}

	}

}
