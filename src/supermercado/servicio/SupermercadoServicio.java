package supermercado.servicio;

import supermercado.model.ArticuloLimpieza;
import supermercado.model.Bebida;
import supermercado.model.Fruta;
import supermercado.model.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SupermercadoServicio {

    private List<supermercado.model.Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Coca-Cola Zero",20D, 1.5));
        productos.add(new Bebida("Coca-Cola", 18D, 1.5));
        productos.add(new ArticuloLimpieza("Shampoo Sedal", 19D, 500D));
        productos.add(new Fruta("Frutillas", 64D, "kilo"));

        return productos;
    }

    public void imprimirLista() {
        List<Producto> products = cargarProductos();

        for (Producto producto : products) {
            System.out.println(producto);
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(products).getNombre());
        System.out.println("Producto más barato: " + Collections.min(products).getNombre());
    }
}
