package ejercicio6;
import ejercicio6.NivelCarrera.Carrera;
import java.util.ArrayList;
import java.util.List;

public class Curso {


    private int codigo;
    private String nombre;
    private int creditos;
    private int numeroSalon;
    private String nombreEdificio;
    private Carrera Carrera;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;


    public Curso(int codigo, String nombre, int creditos, int numeroSalon, String nombreEdificio, Carrera carrera, ejercicio6.NivelCarrera.Carrera Carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.numeroSalon = numeroSalon;
        this.nombreEdificio = nombreEdificio;
        this.Carrera = Carrera;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public int ObtCodigo() {
        return codigo;
    }

    public void PonCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String ObtNombre() {
        return nombre;
    }

    public void PonNombre(String nombre) {
        this.nombre = nombre;
    }

    public int ObtCreditos() {
        return creditos;
    }

    public void PonCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int ObtNumeroSalon() {
        return numeroSalon;
    }

    public void PonNumeroSalon(int numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public String ObtNombreEdificio() {
        return nombreEdificio;
    }

    public void PonNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public Carrera ObtCarrera() {
        return Carrera;
    }

    public void PonCarrera(Carrera carrera, ejercicio6.NivelCarrera.Carrera Carrera) {
        this.Carrera = Carrera;
    }

    public List<Profesor> ObtProfesores() {
        return profesores;
    }

    public void PonProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Estudiante> ObtEstudiantes() {
        return estudiantes;
    }

    public void PonEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
