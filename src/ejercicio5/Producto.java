package ejercicio5;

import java.util.Date;

enum TipoProducto {
 LACTEO, CARNICO, FRUTA, ENLATADO
}

class Producto {

 private int codigo;
 private String nombre;
 private TipoProducto tipo;
 private Date fecha_Expiracion;
 private String fabricante;
 private int cantidad_Inventario;
 private double precio_Unitario;


 public Producto(int codigo, String nombre, TipoProducto tipo, Date fecha_Expiracion, String fabricante,
         int cantidad_Inventario, double precio_Unitario) {
     this.codigo = codigo;
     this.nombre = nombre;
     this.tipo = tipo;
     this.fecha_Expiracion = fecha_Expiracion;
     this.fabricante = fabricante;
     this.cantidad_Inventario = cantidad_Inventario;
     this.precio_Unitario = precio_Unitario;
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

 public TipoProducto ObtTipo() {
     return tipo;
 }

 public void PonTipo(TipoProducto tipo) {
     this.tipo = tipo;
 }

 public Date PonerFechaExpiracion() {
     return fecha_Expiracion;
 }

 public void PonerFechaExpiracion(Date fechaExpiracion) {
     this.fecha_Expiracion = fechaExpiracion;
 }

 public String ObtFabricante() {
     return fabricante;
 }

 public void PonFabricante(String fabricante) {
     this.fabricante = fabricante;
 }

 public int ObtCantidadInventario() {
     return cantidad_Inventario;
 }

 public void PonCantidadInventario(int cantidadInventario) {
     this.cantidad_Inventario = cantidadInventario;
 }

 public double ObtPrecio_Unitario() {
     return precio_Unitario;
 }

 public void PontPrecioUnitario(double precioUnitario) {
     this.precio_Unitario = precioUnitario;
 }
}

