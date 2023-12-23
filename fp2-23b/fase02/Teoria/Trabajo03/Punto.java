import java.util.*;
/*
	 Ejercicio de teoria ( ejercicio 1)
	 >	clase punto 
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:horas
	 */
//creaciond ela calse punto para acoplarlo a la clase pincipal llamada problema1_mains
public class Punto {
    int x, y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //funcion que  aplica la forma de distancia entre puntos  haciendo el uso de math , pow(potencia), sqrt(raiz)
    // tomando los valores ya ingresados por el usuario 
    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow((otroPunto.x - this.x), 2) + Math.pow((otroPunto.y - this.y), 2));
    }
}
