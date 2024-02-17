package ejercicio6;
import java.util.ArrayList;
import java.util.List;


enum NivelCarrera {
    PREGRADO, POSTGRADO;
public class Carrera {

    	    private String nombre;
    	    private int creditosTotales;
    	    private int semestres;
    	    private NivelCarrera nivel;
    	    private Facultad facultad;
    	    private List<Estudiante> estudiantes;
    	    private List<Curso> cursos;

 
    	    public Carrera(String nombre, int creditosTotales, int semestres, NivelCarrera nivel, Facultad facultad) {
    	        this.nombre = nombre;
    	        this.creditosTotales = creditosTotales;
    	        this.semestres = semestres;
    	        this.nivel = nivel;
    	        this.facultad = facultad;
    	        this.estudiantes = new ArrayList<>();
    	        this.cursos = new ArrayList<>();
    	    }

    	    public String getNombre() {
    	        return nombre;
    	    }

    	    public void setNombre(String nombre) {
    	        this.nombre = nombre;
    	    }

    	    public int getCreditosTotales() {
    	        return creditosTotales;
    	    }

    	    public void setCreditosTotales(int creditosTotales) {
    	        this.creditosTotales = creditosTotales;
    	    }

    	    public int getSemestres() {
    	        return semestres;
    	    }

    	    public void setSemestres(int semestres) {
    	        this.semestres = semestres;
    	    }

    	    public NivelCarrera getNivel() {
    	        return nivel;
    	    }

    	    public void setNivel(NivelCarrera nivel) {
    	        this.nivel = nivel;
    	    }

    	    public Facultad getFacultad() {
    	        return facultad;
    	    }

    	    public void setFacultad(Facultad facultad) {
    	        this.facultad = facultad;
    	    }

    	    public List<Estudiante> getEstudiantes() {
    	        return estudiantes;
    	    }

    	    public void setEstudiantes(List<Estudiante> estudiantes) {
    	        this.estudiantes = estudiantes;
    	    }

    	    public List<Curso> getCursos() {
    	        return cursos;
    	    }

    	    public void setCursos(List<Curso> cursos) {
    	        this.cursos = cursos;
    	    }
}
}

