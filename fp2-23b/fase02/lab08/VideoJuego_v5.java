import java.util.*;
import java.util.stream.Collectors;
public class VideoJuego_v5 {
public static void main(String args[]) {

/*
	 Reusando el codiogo de los anterioes labs
	
		 laboratorio Nro 8 ejercicio 1
		 //clase principal usando hasmap
		 Autor :Mikhail Gabino Velasque Arcos
		colaboro:---
		tiempo:
		 */
	        int filas = 10;
	        int columnas = 10;
	        int n = new Random().nextInt(10) + 1;
	        HashMap<String, Soldado> ejercito1 = crearEjercito(n, filas, columnas, "E1");
	        HashMap<String, Soldado> ejercito2 = crearEjercito(n, filas, columnas, "E2");

	        mostrarTablero(filas, columnas, ejercito1, ejercito2);

	        System.out.println("\nEjército 1:");
	        mostrarEstadisticas(ejercito1);

	        System.out.println("\nEjército 2:");
	        mostrarEstadisticas(ejercito2);

	        String ganador = determinarGanador(ejercito1, ejercito2);
	        System.out.println("\nEl ejército ganador es: " + ganador);
	    }

	    public static HashMap<String, Soldado> crearEjercito(int n, int filas, int columnas, String ejercitoPrefix) {
	        HashMap<String, Soldado> ejercito = new HashMap<>();
	        Random rand = new Random();
	        for (int i = 1; i <= n; i++) {
	            String nombre = ejercitoPrefix + "-" + i;
	            int puntosDeVida = rand.nextInt(5) + 1;

	            String posicion;
	            do {
	                int fila = rand.nextInt(filas) + 1;
	                int columna = rand.nextInt(columnas) + 1;
	                posicion = fila + "-" + columna;
	            } while (ejercito.containsKey(posicion));
	            Soldado soldado = new Soldado(nombre, puntosDeVida);
	            ejercito.put(posicion, soldado);
	        }
	        return ejercito;
	    }

	    public static void mostrarTablero(int filas, int columnas, HashMap<String, Soldado> ejercito1, HashMap<String, Soldado> ejercito2) {
	        for (int fila = 1; fila <= filas; fila++) {
	            for (int columna = 1; columna <= columnas; columna++) {
	                String posicion = fila + "-" + columna;
	                Soldado soldado1 = ejercito1.get(posicion);
	                Soldado soldado2 = ejercito2.get(posicion);
	                if (soldado1 != null) {
	                    System.out.print("|" + soldado1.getNombre() + "|");
	                } else if (soldado2 != null) {
	                    System.out.print("|" + soldado2.getNombre() + "|");
	                } else {
	                    System.out.print("|____|");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public static void mostrarEstadisticas(HashMap<String, Soldado> ejercito) {
	        List<Soldado> soldados = new ArrayList<>(ejercito.values());
	        int totalVida = soldados.stream().mapToInt(Soldado::getPuntosDeVida).sum();
	        Soldado maxVida = soldados.stream().max(Comparator.comparing(Soldado::getPuntosDeVida)).orElse(null);

	        System.out.println("Puntos de vida promedio: " + (double) totalVida / soldados.size());
	        System.out.println("Soldado con mayor vida: " + maxVida);

	        System.out.println("\nLista de Soldados:");
	        soldados.forEach(System.out::println);

	        System.out.println("\nRanking de poder:");
	        ordenarSoldadosPorPuntosDeVida(soldados);

	        soldados.forEach(System.out::println);
	    }

	    public static void ordenarSoldadosPorPuntosDeVida(List<Soldado> soldados) {
	        soldados.sort(Comparator.comparing(Soldado::getPuntosDeVida).reversed());
	    }

	    public static String determinarGanador(HashMap<String, Soldado> ejercito1, HashMap<String, Soldado> ejercito2) {
	        int totalVidaEjercito1 = calcularTotalVida(ejercito1);
	        int totalVidaEjercito2 = calcularTotalVida(ejercito2);
	        if (totalVidaEjercito1 > totalVidaEjercito2) {
	            return "Ejército 1 (E1)";
	        } else if (totalVidaEjercito1 < totalVidaEjercito2) {
	            return "Ejército 2 (E2)";
	        } else {
	            return "Empate";
	        }
	    }

	    public static int calcularTotalVida(HashMap<String, Soldado> ejercito) {
	        return ejercito.values().stream().mapToInt(Soldado::getPuntosDeVida).sum();
	    }
	}

