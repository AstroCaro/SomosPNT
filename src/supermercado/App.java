package supermercado;

import supermercado.servicio.SupermercadoServicio;

public class App {

    private static final SupermercadoServicio servicio = new SupermercadoServicio();

    public static void main(String[] args) {
        servicio.imprimirLista();
    }
}
