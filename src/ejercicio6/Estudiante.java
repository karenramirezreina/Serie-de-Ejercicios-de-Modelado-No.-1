package ejercicio6;

import ejercicio6.NivelCarrera.Carrera;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Estudiante {

    private String colegio;
    private Date fechaIngreso;
    private List<Carrera> Carreras;


    public Estudiante(String cedula, String nombre, Date fechaNacimiento, Lugar lugarNacimiento,
            String colegio, Date fechaIngreso) {
        super();
        this.colegio = colegio;
        this.fechaIngreso = fechaIngreso;
        this.Carreras = new ArrayList<>();
    }

    public String ObtColegio() {
        return colegio;
    }

    public void PonColegio(String colegio) {
        this.colegio = colegio;
    }

    public Date ObtFechaIngreso() {
        return fechaIngreso;
    }

    public void PonFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<Carrera> ObtCarreras() {
        return Carreras;
    }

    public void PonCarreras(List<Carrera> carreras) {
        this.Carreras = carreras;
    }
}
