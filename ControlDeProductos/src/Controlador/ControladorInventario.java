package controlador;

import Vista.VistaInventario;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import modelo.ModeloInventario;
import Vista.VistaInventario;

public class ControladorInventario {
    ModeloInventario modelo = new ModeloInventario();
    ArchivoTexto arch = new ArchivoTexto();

    public void agregar(String id, String nom, double pre, int cant) {
        modelo.guardarProducto(id, nom, pre, cant);
    }

    public void listar(String[] columnas, VistaInventario vista) {
        arch.abrirArchivoTexto('r', "productos.txt");
        Object[][] datos = arch.obtenerMatrizLineas(columnas.length);
        arch.cerrarArchivo('r');
        
        DefaultTableModel tabla = new DefaultTableModel(datos, columnas);
        vista.getTblInventario().setModel(tabla);
    }
}