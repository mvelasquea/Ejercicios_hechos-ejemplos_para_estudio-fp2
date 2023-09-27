
		
		public class Soldado {
			/*
			 Actividad 4: escribir un programa donde se creen 5 soldados considerando su nombre y nivel de vida. Ingresar sus
		datos y después mostrarlos. con arreglos de objetos
				 */
		    private String nombre;
		    private int nivelVida;

		    public Soldado(String nombre, int nivelVida) {
		        this.nombre = nombre;
		        this.nivelVida = nivelVida;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public int getNivelVida() {
		        return nivelVida;
		    }

		    public void setNivelVida(int nivelVida) {
		        this.nivelVida = nivelVida;
		    }

		    public String toString() {
		        return "Soldado:" + nombre + " con vidad de  " + nivelVida;
		    }

	}


