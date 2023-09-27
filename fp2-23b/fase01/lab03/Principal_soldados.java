import java.util.*;
public class PRINCIPAL_soldados {


		/*
		 clase principal del ejercicio 05 del lab 1  aplicando arreglo de objetos
		 */
		public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        Soldado[] soldados = new Soldado[5];

	        for (int i = 0; i < soldados.length; i++) {
	            System.out.println("Soldado " + (i + 1));
	            System.out.print("Nombre: ");
	            String nombre = entrada.next();
	            System.out.print("Nivel de Vida: ");
	            int nivelVida = entrada.nextInt();

	            soldados[i] = new Soldado(nombre, nivelVida);
	        }

	        System.out.println("\nLOS SOLDADOS CREADOS SON");
	        for (Soldado soldado : soldados) {
	            System.out.println(soldado);
	        }
	    }
	
	
}

