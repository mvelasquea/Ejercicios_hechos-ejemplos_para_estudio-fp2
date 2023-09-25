import java.util.Scanner;

public class VideoJuego_v4{
public static void main (String args[]) {
	
	/*
	 laboratorio Nro 1 ejercicio 4
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:
	 */
	/*
	Actividad 4: escribir un programa donde se creen 5 soldados considerando su nombre y nivel de vida. Ingresar sus
	datos y después mostrarlos.
	Restricción: aplicar arreglos estándar. (Todavía no aplicar arreglo de objetos)
	*/
	/*
	 Reutilizando el codigo de la anterior actividad 
	  */
	Scanner entrada=new Scanner  (System.in);
	String soldados[]=new String [5];
	int vida[]=new int [5];
			System.out.println("ingrese los nombres y porcentaje de vida de los soldados ");
	for (int i=0;i<5;i++) {
		soldados[i]=entrada.next();	
		vida[i]=entrada.nextInt();
	}
	
	for (int k=0;k<soldados.length;k++) {


		System.out.println("-soldado "+soldados[k] +" con vida de "+ vida[k] +"%");
		
	}}}
