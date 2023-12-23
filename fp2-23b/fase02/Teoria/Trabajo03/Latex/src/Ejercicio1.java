import java.util.*;
/*
Ejercicio de teoria ( ejercicio 1)
>	clase PRINCIPAL MAIN 
Autor :Mikhail Gabino Velasque Arcos
colaboro:---
tiempo:horas
*/
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// introduccion de valores tano del punto A como el del punto B 
        //Se obtiene  2 valores "x" y dos valores "y" respectivamente a los puntos ya antes mencionados
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
// se llama a la funcion de "distancia" para luego ejecutarla y mostrar el resultado
        System.out.println("La distancia entre los puntos es: " + punto1.distancia(punto2));
    }}

