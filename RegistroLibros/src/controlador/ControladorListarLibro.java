package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarLibro;
import vista.VistaLibro;

public class ControladorListarLibro {

    ModeloListarLibro objModelo;
    VistaLibro vista;

    public ControladorListarLibro(VistaLibro vista) {
        this.vista = vista;
        this.objModelo = new ModeloListarLibro();
    }

    public void listar(String[] columnas) {

        Object[][] datos = this.objModelo.listar(columnas);

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

        vista.tblLibros.setModel(modelo);
    }
}