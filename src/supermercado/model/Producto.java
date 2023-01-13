package supermercado.model;

public class Producto implements Comparable<Producto> {

    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " /// Precio: $" + String.format("%.0f", precio);
    }

    @Override
    public int compareTo(Producto producto) {
        return (this.precio.compareTo(producto.getPrecio()));
    }

}
