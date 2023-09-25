import java.util.*;

public class VideoJuego_v3 {

	/*
	 laboratorio Nro 1 ejercicio 3
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:
	 */
	/*
	 Actividad 3: escribir un programa donde se creen 5 soldados considerando sólo su nombre. Ingresar sus datos y
después mostrarlos.
Restricción: aplicar arreglos estándar.
	 */
	
	public static void main (String args []) {
		Scanner entrada=new Scanner  (System.in);
		String soldados[]=new String [5];
		System.out.println("ingrese los nombres de los soldados ");
		for (int i=0;i<5;i++) {
			soldados[i]=entrada.next();	
		}
		
		for (int k=0;k<soldados.length;k++) {
	

			System.out.println("-soldado "+soldados[k]);
			
		}}}
