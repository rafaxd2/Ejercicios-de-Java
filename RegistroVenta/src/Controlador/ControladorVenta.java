package controlador;

import Vista.VistaVenta;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import modelo.ModeloVenta;
import Vista.VistaVenta;

public class ControladorVenta {
    ModeloVenta modelo = new ModeloVenta();
    ArchivoTexto arch = new ArchivoTexto();

    public void guardar(String fec, String pro, int cant, double tot) {
        modelo.registrarVenta(fec, pro, cant, tot);
    }

    public void consultar(String[] columnas, VistaVenta vista) {
        arch.abrirArchivoTexto('r', "ventas.txt");
        Object[][] datos = arch.obtenerMatrizLineas(columnas.length);
        arch.cerrarArchivo('r');
        
        DefaultTableModel tabla = new DefaultTableModel(datos, columnas);
        vista.getTblVentas().setModel(tabla);
    }
}