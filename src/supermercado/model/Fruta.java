package supermercado.model;

public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, Double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " /// Precio: $" + String.format("%.0f", precio)
                + " /// Unidad de venta: " + unidadDeVenta;
    }
}
