package supermercado;

import supermercado.servicio.ProductoServicio;

public class App {

    private static final ProductoServicio servicio = new ProductoServicio();

    public static void main(String[] args) throws Exception {
        servicio.imprimirLista();
    }
}
