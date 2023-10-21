public class Soldado {
		/*
		 Reusando el codiogo de los anterioes labs
		
			 laboratorio Nro 5 ejercicio 1
			 //clase soldado
			 Autor :Mikhail Gabino Velasque Arcos
			colaboro:---
			tiempo:
			 */
	   private String nombre;
	    private int puntosDeVida;
	    private int fila;
	    private int columna;

	    public Soldado(String nombre, int puntosDeVida) {
	        this.nombre = nombre;
	        this.puntosDeVida = puntosDeVida;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getPuntosDeVida() {
	        return puntosDeVida;
	    }

	    public void setPuntosDeVida(int puntosDeVida) {
	        this.puntosDeVida = puntosDeVida;
	    }

	    public int getFila() {
	        return fila;
	    }

	    public void setFila(int fila) {
	        this.fila = fila;
	    }

	    public int getColumna() {
	        return columna;
	    }

	    public void setColumna(int columna) {
	        this.columna = columna;
	    }

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Vida: " + puntosDeVida + ", Fila: " + fila + ", Columna: " + columna;
	    }
	}

