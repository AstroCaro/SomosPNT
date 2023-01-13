package supermercado.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import supermercado.model.ArticuloLimpieza;
import supermercado.model.Bebida;
import supermercado.model.Fruta;
import supermercado.model.Producto;

public class ProductoServicio {

    public Producto crearBebida(String nombre,
                                Double precio,
                                Double volumen) throws Exception {
        if (nombre.isEmpty() || precio <= 0 || volumen <= 0) {
            throw new Exception("Bebida inválida");
        }
        return new Bebida(nombre, precio, volumen);
    }

    public Producto crearArticuloLimpieza(String nombre,
                                          Double precio,
                                          Double volumen) throws Exception {
        if (nombre.isEmpty() || precio <= 0 || volumen <= 0) {
            throw new Exception("Artículo de limpieza inválido");
        }
        return new ArticuloLimpieza(nombre, precio, volumen);
    }

    public Producto crearFruta(String nombre,
                               Double precio,
                               String unidadDeVenta) throws Exception {
        if (nombre.isEmpty() || precio <= 0 || unidadDeVenta.isEmpty()) {
            throw new Exception("Fruta ingresada inválida");
        }
        return new Fruta(nombre, precio, unidadDeVenta);
    }

    private List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        try {
            productos.add(crearBebida("Coca-Cola Zero", 20D, 1.5));
            productos.add(crearBebida("Coca-Cola", 18D, 1.5));
            productos.add(crearArticuloLimpieza("Shampoo Sedal", 19D, 500D));
            productos.add(crearFruta("Frutillas", 64D, "kilo"));
        } catch (Exception e) {
            System.out.println("Producto/s inválido");
        }
        return productos;
    }

    public void imprimirLista() {
        try {
            List<Producto> products = cargarProductos();
            for (Producto producto : products) {
                System.out.println(producto);
            }

            System.out.println("=============================");
            System.out.println("Producto más caro: " + Collections.max(products).getNombre());
            System.out.println("Producto más barato: " + Collections.min(products).getNombre());
        } catch (Exception e) {
            System.out.println("Ejecución finalizada");
        }
    }

}
