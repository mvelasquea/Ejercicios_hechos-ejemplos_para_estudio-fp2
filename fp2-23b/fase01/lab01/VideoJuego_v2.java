import java.util.*;

public class VideoJuego_v2{
public static void main(String args[]) {
	/*
	 Actividad 2: escribir un programa donde se creen 5 soldados considerando su nombre y nivel de vida. Ingresar sus
datos y después mostrarlos.
Restricción: se realizará considerando sólo los conocimientos que se tienen de FP1 y sin utilizar arreglos estándar,
sólo usar variables simples.
*/

	//estoy reutilizando el codigo fuente del ejercicio01 
	//actividad numero 2 del laboratorio 
	
/*
	 laboratorio Nro 1 ejercicio 2
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
System.out.println("ingrese el nombre del soldado "+i++ +" mas el porcentaje de vida (0 - 100)");
soldado01=entrada.next();
 int vida01=entrada.nextInt();
System.out.println("ingrese el nombre del soldado "+i++ +" mas el porcentaje de vida (0 - 100)");
soldado02=entrada.next();
int vida02=entrada.nextInt();
System.out.println("ingrese el nombre del soldado "+i++ +" mas el porcentaje de vida (0 - 100)");
soldado03=entrada.next();
int vida03=entrada.nextInt();
System.out.println("ingrese el nombre del soldado "+i++ +" mas el porcentaje de vida (0 - 100)");
soldado04=entrada.next();
int vida04=entrada.nextInt();
System.out.println("ingrese el nombre del soldado "+i++ +" mas el porcentaje de vida (0 - 100)");
soldado05=entrada.next();
int vida05=entrada.nextInt();
int j=1;
System.out.println("El nombre y vidade los 5 soldados es: " );
System.out.println(j++ +"-"+soldado01 +" con vida de ->"+vida01);
System.out.println(j++ +"-"+soldado02+" con vida de ->"+vida02);
System.out.println(j++ +"-"+soldado03+" con vida de ->"+vida03);
System.out.println(j++ +"-"+soldado04+" con vida de ->"+vida04);
System.out.println(j++ +"-"+soldado05+" con vida de ->"+vida05);
}

	
	
}
