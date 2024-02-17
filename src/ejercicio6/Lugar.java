package ejercicio6;

public class Lugar {

    private String ciudad;
    private String departamento;
    private String pais;

    public Lugar(String ciudad, String departamento, String pais) {
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }

    public String ObtCiudad() {
        return ciudad;
    }

    public void PonCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String ObtDepartamento() {
        return departamento;
    }

    public void PonDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String ObtPais() {
        return pais;
    }

    public void PonPais(String pais) {
        this.pais = pais;
    }
}