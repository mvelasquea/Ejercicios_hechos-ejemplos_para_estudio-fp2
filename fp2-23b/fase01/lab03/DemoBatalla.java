public class DemoBatalla {
	/*
	 laboratorio Nro 3 ejercicio 1
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:
	 */
	public static void main(String [] args){
		Nave [] misNaves = new Nave[10];
		Scanner sc = new Scanner(System.in);
		String nomb, col;
		int fil, punt;
		boolean est;
		for (int i = 0; i < misNaves.length; i++) {
		System.out.println("Nave " + (i+1));
		System.out.print("Nombre: ");
		nomb = sc.next();
		System.out.println("Fila ");
		fil = sc.nextInt();
		System.out.print("Columna: ");
		col = sc.next();
		System.out.print("Estado: ");
		est = sc.nextBoolean();
		System.out.print("Puntos: ");
		punt = sc.nextInt();
		misNaves[i] = new Nave(); //Se crea un objeto Nave y se asigna su referencia a misNaves
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
		//Método para mostrar todas las naves
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
		//Método para mostrar todas las naves de un nombre que se pide por teclado
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
		//Método para mostrar todas las naves con un número de puntos inferior o igual
		//al número de puntos que se pide por teclado
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
		//Método que devuelve la Nave con mayor número de Puntos

			public static Nave mostrarMayorPuntos(Nave[] flota) {
			    Nave naveMayor = flota[0]; // Supongamos que la primera nave tiene la mayor cantidad de puntos inicialmente
			    for (int i = 1; i < flota.length; i++) {
			        if (flota[i].getPuntos() > naveMayor.getPuntos()) {
			            naveMayor = flota[i];
			        }
			    }
			    return naveMayor;
			}
		}

