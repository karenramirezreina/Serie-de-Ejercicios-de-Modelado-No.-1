package Actividad1;

public class Reloj {
	
    private int horas;
    private int minutos;
    private int segundos;

//--------------------------------------------------------------------------------
    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int ObtHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int ObtMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int ObtSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

 // -------------------------------------------------------------------------
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void incrementarSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Reloj reloj = new Reloj(23, 59, 55);
        reloj.mostrarHora();
        reloj.incrementarSegundo();
        reloj.mostrarHora();
    }
}
