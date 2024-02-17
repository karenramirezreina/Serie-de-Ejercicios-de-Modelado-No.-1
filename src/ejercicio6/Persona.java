package ejercicio6;
import java.util.Date;

public class Persona {

    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    private Lugar lugarNacimiento;


    public Persona(String cedula, String nombre, Date fechaNacimiento, Lugar lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }


    public String ObtCedula() {
        return cedula;
    }

    public void PontCedula(String cedula) {
        this.cedula = cedula;
    }

    public String ObtNombre() {
        return nombre;
    }

    public void PonNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date ObtFechaNacimiento() {
        return fechaNacimiento;
    }

    public void PonFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Lugar ObtLugarNacimiento() {
        return lugarNacimiento;
    }

    public void PonLugarNacimiento(Lugar lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
}