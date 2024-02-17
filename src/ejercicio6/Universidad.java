package ejercicio6;
import java.util.ArrayList;
import java.util.List;

public class Universidad {


    private String Nombre;
    private String NombreRector;
    private String Ciudad;
    private List<Facultad> Facultades;

    
    public Universidad(String nombre, String nombreRector, String ciudad) {
        this.Nombre = nombre;
        this.NombreRector = nombreRector;
        this.Ciudad = ciudad;
        this.Facultades = new ArrayList<>();
    }


    public String ObtNombre() {
     return Nombre;
   }
    public void PonNombre(String Nombre) {
    	this.Nombre = Nombre;
  }
    public String ObtNombreRector() {
     return NombreRector;
   }
    public void PonNombreRector (String NombreRector) {
    	this.NombreRector = NombreRector;
   }
     public String ObtCiuda() {
     return Ciudad;
   }
     public void PonCiudad (String Ciudad) {
    	 this.Ciudad = Ciudad;
   }
     public List<Facultad> getFacultades() {
         return Facultades;
     }

     public void setFacultades(List<Facultad> facultades) {
         this.Facultades = facultades;
     }

     
}
     

