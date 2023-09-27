import java.util.*;
public class DemoBatalla_v2 {

	public static void main(String[] args) {
		Nave [] misNaves = new Nave[10];
		Scanner entrada = new Scanner(System.in);
		String nomb, col;
		int fil, punt;
		boolean est;
		for (int i = 0; i < misNaves.length; i++) {
		System.out.println("Nave " + (i+1));
		System.out.print("Nombre: ");
		nomb = entrada.next();
		System.out.println("Fila ");
		fil = entrada.nextInt();
		System.out.print("Columna: ");
		col = entrada.next();
		System.out.print("Estado: ");
		est = entrada.nextBoolean();
		System.out.print("Puntos: ");
		punt = entrada.nextInt();
		misNaves[i] = new Nave(); 
		misNaves[i].setNombre(nomb);
		misNaves[i].setFila(fil);
		misNaves[i].setColumna(col);
		misNaves[i].setEstado(est);
		misNaves[i].setPuntos(punt);
		}
		System.out.println("\nNaves creadas:");
		mostrarNaves(misNaves);
		mostrarPorNombre(misNaves);
		mostrarPorPuntos(misNaves);
		System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves));
		}
		
		public static void mostrarNaves(Nave [] flota){
			for (int i = 0; i < flota.length; i++) {
				System.out.println("NOMBRE: " +flota[i].getNombre());
				System.out.println("FILA: " +flota[i].getFila());
				System.out.println("COLUMNA: " +flota[i].getColumna());
				if (flota[i].getEstado()==true) {
				System.out.println("vivo");
				} else {
				System.out.println("muerto");
				}
				System.out.println("PUNTOS DE VIDA: "+flota[i].getPuntos());
				}}
		public static void mostrarPorNombre(Nave [] flota){
			String nombre;
			System.out.println("INGRESAR EL NOMBRE DEL QUE SE BUSCA");
			Scanner objeto= new Scanner(System.in);
			nombre=objeto.nextLine();
			for (int i = 0; i < flota.length; i++) {
			if (flota[i].getNombre().equals(nombre)) {
			System.out.println("COINCIDENCIA CON: "+nombre);
			System.out.println("NOMBRE: " +flota[i].getNombre());
			System.out.println("FILA: " +flota[i].getFila());
			System.out.println("COLUMNA: " +flota[i].getColumna());
			if (flota[i].getEstado()==true) {
			System.out.println("vivo");
			} else {
			System.out.println("esta muerto");
			}
			System.out.println("PUNTOS DE VIDA: "+flota[i].getPuntos());
			break;
			}else{
			System.out.println("---");
			}}}
		public static void mostrarPorPuntos(Nave [] flota){
			for (int i = 0; i < flota.length; i++) {
				int puntoComparacion;
				System.out.println("INGRESE LA CANTIDAD DE VIDA QUE DESEA COMPARAR");
				Scanner objeto= new Scanner(System.in);
				puntoComparacion=objeto.nextInt();
				for (int j = 0; j < flota.length; j++) {
				if (flota[i].getPuntos()<=puntoComparacion) {
				System.out.println("NOMBRE: " +flota[i].getNombre());
				System.out.println("FILA: " +flota[i].getFila());
				System.out.println("COLUMNA: " +flota[i].getColumna());
				if (flota[i].getEstado()==true) {
				System.out.println("vivo");
				} else {
				System.out.println("muerto");
				}
				System.out.println("PUNTOS DE VIDA: "+flota[i].getPuntos());
				}else{
				System.out.println("---");
				}}}}
		
			public static Nave mostrarMayorPuntos(Nave[] flota) {
			    Nave naveMayor = flota[0];
			    for (int i = 1; i < flota.length; i++) {
			        if (flota[i].getPuntos() > naveMayor.getPuntos()) {
			            naveMayor = flota[i];
			        }
			    }
			    return naveMayor;
			    
			}
			//-ADELANTO del lab 04
			
			
			//Método para buscar la primera nave con un nombre que se pidió por teclado
			public static int busquedaLinealNombre(Nave[] flota, String s){
			}
			//Método que ordena por número de puntos de menor a mayor
			public static void ordenarPorPuntosBurbuja(Nave[] flota){
			}
			//Método que ordena por nombre de A a Z
			public static void ordenarPorNombreBurbuja(Nave[] flota){
			}
			//Método para buscar la primera nave con un nombre que se pidió por teclado
			public static int busquedaBinariaNombre(Nave[] flota, String s){
			}
			//Método que ordena por número de puntos de menor a mayor
			public static void ordenarPorPuntosSeleccion(Nave[] flota){
			}
			//Método que ordena por nombre de A a Z
			public static void ordenarPorNombreSeleccion(Nave[] flota){
			}
			//Método que muestra las naves ordenadas por número de puntos de mayor a menor
			public static void ordenarPorPuntosInsercion(Nave[] flota){
			}
			//Método que muestra las naves ordenadas por nombre de Z a A
			public static void ordenarPorNombreInsercion(Nave[] flota){
			}
		
			

}
