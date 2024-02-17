package ejercicio6;

import java.util.Date;
public class Profesor extends Persona {


    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad facultad;


    public Profesor(String cedula, String nombre, Date fechaNacimiento, Lugar lugarNacimiento,
            String profesion, String nacionalidad, double sueldo, Facultad facultad) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
}