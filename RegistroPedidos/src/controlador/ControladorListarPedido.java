package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarPedido;
import vista.VistaPedido;

public class ControladorListarPedido {

    ModeloListarPedido objModelo;
    VistaPedido vista;

    public ControladorListarPedido(VistaPedido vista) {
        this.vista = vista;
        this.objModelo = new ModeloListarPedido();
    }

    public void listar(String[] columnas) {

        Object[][] datos = this.objModelo.listar(columnas);

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

        vista.tblPedidos.setModel(modelo);
    }
}