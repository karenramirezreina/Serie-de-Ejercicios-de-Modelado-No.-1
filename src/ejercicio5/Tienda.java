package ejercicio5;

import java.util.Date;

public class Tienda {


    private String nombre;
    private String direccion;
    private String telefono;


    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public String ObtNombre() {
        return nombre;
    }

    public void PonNombre(String nombre) {
        this.nombre = nombre;
    }

    public String ObtDireccion() {
        return direccion;
    }

    public void PonDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String ObtTelefono() {
        return telefono;
    }

    public void PonTelefono(String telefono) {
        this.telefono = telefono;
    }

 // -------------------------------------------------------------------------------------------
    public void agregarProducto(Producto producto) {

        System.out.println("Producto agregado a la tienda: " + producto.ObtNombre());
    }

    public static void main(String[] args) {
        
        Tienda LaEconomia = new Tienda("Mi Tienda", "Calle Principal 123", "555-1234");


        Producto producto1 = new Producto(1, "yogurt", TipoProducto.LACTEO, new Date(), "Fabricante1", 100, 2.5);
        Producto producto2 = new Producto(2, "Carne", TipoProducto.CARNICO, new Date(), "Fabricante2", 50, 8.99);
        Producto producto3 = new Producto(3, "Banano", TipoProducto.FRUTA, new Date(), "Fabricante3", 200, 1.0);
        Producto producto4 = new Producto(4, "Atún", TipoProducto.ENLATADO, new Date(), "Fabricante4", 80, 3.75);


        LaEconomia.agregarProducto(producto1);
        LaEconomia.agregarProducto(producto2);
        LaEconomia.agregarProducto(producto3);
        LaEconomia.agregarProducto(producto4);
    }
}

