import java.util.*;
public class Ejercito_vs {

	public static void main(String[] args) {
		 Soldado[] ejercito1 = inicioPROGRA();
	        Soldado[] ejercito2 = inicioPROGRA();

	        System.out.println("Ejército 1:");
	        mostrar_Ejercito(ejercito1);

	        System.out.println("\nEjército 2:");
	        mostrar_Ejercito(ejercito2);

	        int cantidad_ejercito1 = ejercito1.length;
	        int cantidad_ejercito2 = ejercito2.length;

	        if (cantidad_ejercito1 > cantidad_ejercito2) {
	            System.out.println("\nEl Ejército 1 gana");
	        } else if (cantidad_ejercito2 > cantidad_ejercito1) {
	            System.out.println("\nEl Ejército 2 gana");
	        } else {
	            System.out.println("\nEmpate");
	        }
	    }

	    public static Soldado[] inicioPROGRA() {
	        Random r = new Random();
	        int cantidadSoldados = r.nextInt(5) + 1;
	        Soldado[] ejercito = new Soldado[cantidadSoldados];

	        for (int i = 0; i < cantidadSoldados; i++) {
	            ejercito[i] = new Soldado("Soldado" + i);
	        }

	        return ejercito;
	    }
	    public static void mostrar_Ejercito(Soldado[] ejercito) {
	        for (int i = 0; i < ejercito.length; i++) {
	            System.out.println("Soldado " + (i + 1) );
	        }
	    }
	
	}

