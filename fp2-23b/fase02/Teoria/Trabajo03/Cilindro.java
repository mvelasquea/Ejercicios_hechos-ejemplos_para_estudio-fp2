
// Clase derivada Cilindro de la clase Punto
public class Cilindro extends Punto {
    private double longitud; // Longitud del cilindro

    // Constructor que toma dos puntos y establece la longitud del cilindro
    public Cilindro(Punto punto1, Punto punto2, double longitud) {
        super(punto1.x, punto1.y); // Llama al constructor de la clase base (Punto) para establecer las coordenadas del punto
        this.longitud = longitud;
    }

    // Función para calcular la superficie del cilindro
    public double calcularSuperficie() {
        double radio = distancia(new Punto(0, 0)); // Usa la distancia entre el punto y el origen como el radio
        return 2 * Math.PI * radio * (longitud + radio);
    }
}

