import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class VideoJuegoo_v2 {
	 public static void main(String[] args) {
	        int filas = 10; 
	        int columnas = 10; 
	        int cantidad = new Random().nextInt(10) + 1;

	        ArrayList<Soldado> soldados = crearSoldados(cantidad);
	        Soldado[][] tablero = crearTablero(filas, columnas, soldados);  
	        mostrarTablero(tablero);     
	        System.out.println("\nLista de Soldados:");
	        for (Soldado soldado : soldados) {
	            System.out.println("Nombre: " + soldado.getNombre() + ", Vida: " + soldado.getPuntosDeVida() + ", Fila: " + soldado.getFila() + ", Columna: " + soldado.getColumna());
	        }}
	    public static ArrayList<Soldado> crearSoldados(int n) {
	        ArrayList<Soldado> soldados = new ArrayList<>();
	        Random r = new Random();

	        for (int i = 1; i <= n; i++) {
	            String nombre = "Soldado" + i;
	            int puntosDeVida = r.nextInt(10) + 1; 
	            soldados.add(new Soldado(nombre, puntosDeVida));
	        }

	        return soldados;
	    }

	    public static Soldado[][] crearTablero(int filas, int columnas, ArrayList<Soldado> soldados) {
	        Soldado[][] tablero = new Soldado[filas + 1][columnas + 1];
	        Random r = new Random();

	        for (Soldado soldado : soldados) {
	            int fila, columna;
	            do {
	                fila = r.nextInt(filas) + 1; 
	                columna = r.nextInt(columnas) + 1; 
	            } while (tablero[fila][columna] != null);

	            soldado.setFila(fila);
	            soldado.setColumna(columna);
	            tablero[fila][columna] = soldado;
	        }

	        return tablero;
	    }

	    public static void mostrarTablero(Soldado[][] tablero) {
	        for (int fila = 1; fila < tablero.length; fila++) { 
	            for (int columna = 1; columna < tablero[fila].length; columna++) { 
	                Soldado soldado = tablero[fila][columna];
	                if (soldado != null) {
	                    System.out.print("| " + soldado.getNombre().substring(7) + " |");
	                } else {
	                    System.out.print("|___|");
	                }
	            }
	            System.out.println();
	        }
	  }
	} 
