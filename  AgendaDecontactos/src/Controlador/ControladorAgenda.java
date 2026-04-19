package controlador;

import Vista.VistaAgenda;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import modelo.ModeloAgenda;
import Vista.VistaAgenda; 

public class ControladorAgenda {
    ModeloAgenda modelo = new ModeloAgenda();
    ArchivoTexto arch = new ArchivoTexto();

    // Método para guardar
    public void botonAgregar(String n, String t, String e) {
        modelo.guardarEnArchivo(n, t, e);
    }

    // Método para llenar la tabla
    public void botonMostrar(String[] columnas, VistaAgenda vista) {
        arch.abrirArchivoTexto('r', "contactos.txt");
        Object[][] datos = arch.obtenerMatrizLineas(columnas.length);
        arch.cerrarArchivo('r');
        
        DefaultTableModel tabla = new DefaultTableModel(datos, columnas);
        vista.getTblContactos().setModel(tabla);
    }
}