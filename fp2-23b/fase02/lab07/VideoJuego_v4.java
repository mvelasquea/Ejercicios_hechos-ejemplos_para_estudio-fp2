import java.util.*;
public class VideoJuego_v4 {
	/*
	 Reusando el codigo de los anterioes labs
	
		 laboratorio Nro 7 ejercicio 1 
		 //clase PRINCIPAL
		 Autor :Mikhail Gabino Velasque Arcos
		colaboro:---	
		tiempo:
		 */

	 public static void main(String[] args) {
	        int filas = 10; 
	        int columnas = 10; 
	        int n = new Random().nextInt(10) + 1; 
	        ArrayList<Soldado> ejercito1 = crearEjercito(n, filas, columnas, "E1");
	        ArrayList<Soldado> ejercito2 = crearEjercito(n, filas, columnas, "E2");

	        mostrarTablero(filas, columnas, ejercito1, ejercito2);

	        System.out.println("\nEjército 1:");
	        mostrarEstadisticas(ejercito1);

	        System.out.println("\nEjército 2:");
	        mostrarEstadisticas(ejercito2);

	        String ganador = determinarGanador(ejercito1, ejercito2);
	        System.out.println("\nEl ejército ganador es: " + ganador);
	    }

	    public static ArrayList<Soldado> crearEjercito(int n, int filas, int columnas, String ejercitoPrefix) {
	        ArrayList<Soldado> ejercito = new ArrayList<>();
	        Random rand = new Random();
	        for (int i = 1; i <= n; i++) {
	            String nombre = ejercitoPrefix + "-" + i; 
	            int puntosDeVida = rand.nextInt(5) + 1; 

	            int fila, columna;
	            do {
	                fila = rand.nextInt(filas) + 1;
	                columna = rand.nextInt(columnas) + 1;
	            } while (yaOcupada(fila, columna, ejercito));
	            Soldado soldado = new Soldado(nombre, puntosDeVida);
	            soldado.setFila(fila);
	            soldado.setColumna(columna);
	            ejercito.add(soldado);
	        }
	        return ejercito;
	    }

	    public static boolean yaOcupada(int fila, int columna, ArrayList<Soldado> ejercito) {
	        for (Soldado soldado : ejercito) {
	            if (soldado.getFila() == fila && soldado.getColumna() == columna) {
	                return true;
	            }}
	        return false;
	    }
	    public static void mostrarTablero(int filas, int columnas, ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2) {
	        for (int fila = 1; fila <= filas; fila++) {
	            for (int columna = 1; columna <= columnas; columna++) { 
	                Soldado soldado1 = encontrarSoldadoEnPosicion(fila, columna, ejercito1);
	                Soldado soldado2 = encontrarSoldadoEnPosicion(fila, columna, ejercito2);
	                if (soldado1 != null) {
	                    System.out.print("|" + soldado1.getNombre() + "|");
	                } else if (soldado2 != null) {
	                    System.out.print("|" + soldado2.getNombre() + "|");
	                } else {
	                    System.out.print("|____|");
	                }}
	            System.out.println(); 
	        }}
	    public static Soldado encontrarSoldadoEnPosicion(int fila, int columna, ArrayList<Soldado> ejercito) {
	        for (Soldado soldado : ejercito) {
	            if (soldado.getFila() == fila && soldado.getColumna() == columna) {
	                return soldado;
	            }}
	        return null;
	    }
	    public static void mostrarEstadisticas(ArrayList<Soldado> ejercito) {
	        int totalVida = 0;
	        Soldado maxVida = ejercito.get(0);

	        for (Soldado soldado : ejercito) {
	            totalVida += soldado.getPuntosDeVida();
	            if (soldado.getPuntosDeVida() > maxVida.getPuntosDeVida()) {
	                maxVida = soldado;
	            }
	        }

	        System.out.println("Puntos de vida promedio: " + (double) totalVida / ejercito.size());
	        System.out.println("Soldado con mayor vida: " + maxVida);

	        System.out.println("\nLista de Soldados:");
	        for (Soldado soldado : ejercito) {
	            System.out.println(soldado);
	        }

	        System.out.println("\nRanking de poder:");
	        ordenarSoldadosPorInsercion(ejercito);
	        ordenarSoldadosPorBurbuja(ejercito);
	        
	        for (Soldado soldado : ejercito) {
	            System.out.println(soldado);
	        }
	    }
	    public static String determinarGanador(ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2) {
	        int totalVidaEjercito1 = calcularTotalVida(ejercito1);
	        int totalVidaEjercito2 = calcularTotalVida(ejercito2);
	        if (totalVidaEjercito1 > totalVidaEjercito2) {
	            return "Ejército 1 (E1)";
	        } else if (totalVidaEjercito1 < totalVidaEjercito2) {
	            return "Ejército 2 (E2)";
	        } else {
	            return "Empate";
	        }}
	    public static int calcularTotalVida(ArrayList<Soldado> ejercito) {
	        int totalVida = 0;
	        for (Soldado soldado : ejercito) {
	            totalVida += soldado.getPuntosDeVida();
	        }
	        return totalVida;
	    }
	    public static void ordenarSoldadosPorInsercion(ArrayList<Soldado> ejercito) {
	        int n = ejercito.size();
	        for (int i = 1; i < n; i++) {
	            Soldado actual = ejercito.get(i);
	            int j = i - 1;

	            while (j >= 0 && ejercito.get(j).getPuntosDeVida() < actual.getPuntosDeVida()) {
	                ejercito.set(j + 1, ejercito.get(j));
	                j--;
	            }
	            ejercito.set(j + 1, actual);
	        }
	    }
	    public static void ordenarSoldadosPorBurbuja(ArrayList<Soldado> ejercito) {
	        int n = ejercito.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (ejercito.get(j).getPuntosDeVida() < ejercito.get(j + 1).getPuntosDeVida()) {
	                    Soldado temp = ejercito.get(j);
	                    ejercito.set(j, ejercito.get(j + 1));
	                    ejercito.set(j + 1, temp);
	                }
	            }
	        }
	    }
	}
