package controlador;

import modelo.ModeloRegistrarPedido;

public class ControladorRegistrarPedido {

    ModeloRegistrarPedido objModelo;

    public ControladorRegistrarPedido() {
        this.objModelo = new ModeloRegistrarPedido();
    }

    public void registrar(String cliente, String producto, String cantidad) {
        this.objModelo.registrar(cliente, producto, cantidad);
    }
}