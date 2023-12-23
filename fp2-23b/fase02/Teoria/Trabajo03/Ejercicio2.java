import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitando valores de los puntos al usuario  al igual que la longitud 
        System.out.println("Ingrese la coordenada x del primer punto: ");
        int x1 = scanner.nextInt();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        int y1 = scanner.nextInt();

        Punto punto1 = new Punto(x1, y1);

        System.out.println("Ingrese la coordenada x del segundo punto: ");
        int x2 = scanner.nextInt();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        int y2 = scanner.nextInt();

        Punto punto2 = new Punto(x2, y2);

        System.out.println("Ingrese la longitud del cilindro: ");
        double longitudCilindro = scanner.nextDouble();

        // creando el objeto de cilindro
        Cilindro cilindro = new Cilindro(punto1, punto2, longitudCilindro);

        // manda valores a la clase cilindro y lo calcula para mostrarlo
        System.out.println("La superficie del cilindro es: " + cilindro.calcularSuperficie());
    }
}

