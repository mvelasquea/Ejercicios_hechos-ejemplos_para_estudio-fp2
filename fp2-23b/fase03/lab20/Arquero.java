
public class Arquero extends Soldado{
	/*
	Ejercicio lab 20 
	>	clase derivada de Soldado (Arquero) 
	Autor :Mikhail Gabino Velasque Arcos
	tiempo:---
	*/
    private int numFlechas;
    public Arquero(String nombre, int fila, int columna){
        super(nombre, fila, columna);
        int numeroAleatorio = (int)(Math.random() * 3 + 1);
		setVidaActual(numeroAleatorio);
        numFlechas = (int)(Math.random()* 1000);
    }
    public void disparar(){
        numFlechas--;
        if(numFlechas == 0){
            System.out.println("No se puede atacar");
        }else{
            atacar();
        }
        
    }
    public String impresionTabla(){
        return "A"+this.getVidaActual();
    }
    public String toString(){
        return "Nombre: " + nombre + "\n" +
        "Nivel de Ataque: " + nivelAtaque + "\n" +
        "Nivel de Defensa: " + nivelDefensa + "\n" +
        "Vida Actual: " + vidaActual + "\n";
    }
}



