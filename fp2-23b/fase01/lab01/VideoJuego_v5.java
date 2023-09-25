import java.util.*;

public class VideoJuego_v5 {
public static void main(String args[]) {
	/*
	 laboratorio Nro 1 ejercicio 5
	 Autor :Mikhail Gabino Velasque Arcos
	colaboro:---
	tiempo:
	 */
	/*
	 Actividad 5: escribir un programa donde se creen 2 ejércitos, cada uno con un número aleatorio de soldados entre
1 y 5, considerando sólo su nombre. Sus datos se inicializan automáticamente con nombres tales como “Soldado0”,
“Soldado1”, etc. Luego de crear los 2 ejércitos se deben mostrar los datos de todos los soldados de ambos ejércitos
e indicar qué ejército fue el ganador.
Restricción: aplicar arreglos estándar y métodos para inicializar los ejércitos, mostrar ejército y mostrar ejército
ganador. La métrica a aplicar para indicar el ganador es el mayor número de soldados de cada ejército, puede
haber empates. (Todavía no aplicar arreglo de objetos)
	 */
	//uso del codigo de la anterior actividad
int random_1=0;
int random_2=0;
Random r=new Random();
random_1=(int)(r.nextDouble()*5);
random_2=(int)(r.nextDouble()*5);
for (int i=0;i<random_1;i++) {
	System.out.println("Ejercito 1 :soldado 0"+i);		
}
for (int j=0;j<random_2;j++) {
	System.out.println("Ejercito 2 :soldado 0"+j);			
}
if (random_1> random_2) {
	System.out.println("el Ejercito 1 gana");
}else {
	if(random_1<random_2) {
	System.out.println("el Ejercito 2 gana");
	}else {
		System.out.println("empate");
	}
	
}

}}

	
