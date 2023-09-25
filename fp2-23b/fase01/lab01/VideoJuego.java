import java.util.*;
public class VideoJuego {
public static void main (String args[]) {	
	/*
	 Actividad 1: escribir un programa donde se creen 5 soldados considerando sólo su nombre. Ingresar sus datos y
después mostrarlos.
Restricción: se realizará considerando sólo los conocimientos que se tienen de FP1 y sin utilizar arreglos estándar,
sólo usar variables simples.
	
	 */
	/*
	 laboratorio Nro 1 ejercicio 1
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:
	 */
Scanner entrada=new Scanner  (System.in);
	String soldado01;
	String soldado02;
	String soldado03;
	String soldado04;
	String soldado05;
	int i=1;
System.out.println("ingrese el nombre del soldado "+i++);
soldado01=entrada.nextLine();
System.out.println("ingrese el nombre del soldado "+i++);
soldado02=entrada.nextLine();
System.out.println("ingrese el nombre del soldado "+i++);
soldado03=entrada.nextLine();
System.out.println("ingrese el nombre del soldado "+i++);
soldado04=entrada.nextLine();
System.out.println("ingrese el nombre del soldado "+i++);
soldado05=entrada.nextLine();
int j=1;
System.out.println("el nombre de los 5 soldados es: ");
System.out.println(j++ +"-"+soldado01);
System.out.println(j++ +"-"+soldado02);
System.out.println(j++ +"-"+soldado03);
System.out.println(j++ +"-"+soldado04);
System.out.println(j++ +"-"+soldado05);
}


}
