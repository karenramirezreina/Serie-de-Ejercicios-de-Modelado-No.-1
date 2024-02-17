package ejercicio6;
import ejercicio6.NivelCarrera.Carrera;

import java.util.ArrayList;
import java.util.List;

public class Facultad {


    private String nombre;
    private int codigo;
    private List<Profesor> profesores;
    private List<Carrera> Carreras;


    public Facultad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesores = new ArrayList<>();
        this.Carreras = new ArrayList<>();
    }

    public String ObtNombre() {
        return nombre;
    }

    public void PonNombre(String nombre) {
        this.nombre = nombre;
    }

    public int ObtCodigo() {
        return codigo;
    }

    public void PonCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Profesor> ObtProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Carrera> ObtCarreras() {
        return Carreras;
    }

    public void PonCarreras(List<Carrera> carreras) {
        this.Carreras = carreras;
    }
}