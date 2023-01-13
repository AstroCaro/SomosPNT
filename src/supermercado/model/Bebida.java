package supermercado.model;

public class Bebida extends Producto {

    private Double volumen;

    public Bebida(String nombre, Double precio, Double volumen) {
        super(nombre, precio);
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " /// Litros: " + volumen
                + " /// Precio: $" + String.format("%.0f", precio);
    }
}
