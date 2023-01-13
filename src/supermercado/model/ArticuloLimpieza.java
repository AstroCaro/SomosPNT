package supermercado.model;

public class ArticuloLimpieza extends Producto {

    private Double volumen;

    public ArticuloLimpieza(String nombre, Double precio, Double volumen) {
        super(nombre, precio);
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " /// Contenido: " + String.format("%.0f", volumen) + "ml"
                + " /// Precio: $" + String.format("%.0f", precio);
    }
}
