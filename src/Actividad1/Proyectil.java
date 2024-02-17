package Actividad1;

public class Proyectil {

    private double velocidad;
    private double angulo;

    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }

    public double ObtVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double ObtAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

 // -----------------------------------------------------------------------------------------
    public double calcularAlcance() {
        double g = 9.81; // Aceleración de la gravedad en m/s^2
        double alcance = (Math.pow(velocidad, 2) * Math.sin(2 * Math.toRadians(angulo))) / g;
        return alcance;
    }

    public static void main(String[] args) {
    	
        Proyectil proyectil = new Proyectil(50, 45); // Velocidad de 50 m/s, ángulo de 45 grados
        double alcance = proyectil.calcularAlcance();
        System.out.println("El alcance del proyectil es: " + alcance + " metros.");
    }
}
