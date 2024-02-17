package Actividad1;

public class Fecha {

    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

 //------------------------------------------------------------------------
    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%d\n", dia, mes, año);
    }

    public static void main(String[] args) {
       
        Fecha fecha = new Fecha(2024, 2, 16);
        fecha.mostrarFecha();
    }
}
