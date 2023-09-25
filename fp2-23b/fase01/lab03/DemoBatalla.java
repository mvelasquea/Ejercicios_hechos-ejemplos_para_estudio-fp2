public class DemoBatalla {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		Nave[] misNaves = new Nave[2];
		String nomb, col;
		int fil, punt;
		boolean est;
		for (int i = 0; i < misNaves.length; i++) {
		System.out.println("\033[31mNave " + (i + 1));
		System.out.print("\033[32mNombre: ");
		nomb = objeto.next();
		System.out.println("\033[35mFila ");
		fil = objeto.nextInt();
		System.out.print("\033[36mColumna: ");
		col = objeto.next();
		System.out.print("\033[31mEstado: ");
		est = objeto.nextBoolean();
		System.out.print("\033[32mPuntos: ");
		punt = objeto.nextInt();
		misNaves[i] = new Nave();
		//Se crea un objeto Nave y se asigna su referencia a misNaves
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
		public static void mostrarNaves(Nave[] flota) {
		for (int i = 0; i < flota.length; i++) {
		Nave nave = flota[i];
		}}
		//Método para mostrar todas las naves de un nombre que se pide por teclado
		public static void mostrarPorNombre(Nave[] flota) {
		for (int i = 0; i < flota.length; i++) {
		Nave nave = flota[i];
		}
		}
		//Método para mostrar todas las naves con un número de puntos inferior o igual
		//al número de puntos que se pide por teclado
		public static void mostrarPorPuntos(Nave[] flota) {
		for (int i = 0; i < flota.length; i++) {
		Nave nave = flota[i];
		}
		}
		//Método que devuelve la Nave con mayor número de Puntos
		public static Nave mostrarMayorPuntos(Nave[] flota) {
		for (int i = 0; i < flota.length; i++) {
		Nave nave = flota[i];
		}
		
		return null;
		}
		//Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados
		//pero aleatoriamente desordenados
		}
