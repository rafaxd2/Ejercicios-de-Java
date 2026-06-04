package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarEstudiante;
import vista.VistaConsultarEstudiante;

public class ControladorConsultarEstudiante {

    VistaConsultarEstudiante objViewConEst;
    ModeloListarEstudiante objModListEst;

    public ControladorConsultarEstudiante(VistaConsultarEstudiante objViewConEst) {
        this.objViewConEst = objViewConEst;
        this.objModListEst = new ModeloListarEstudiante();
    }

    public void listarEst(String[] columnas) {
        Object[][] datos;
        datos = this.objModListEst.listarEstudiantes(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objViewConEst.tblEstudiantes.setModel(modelo);
    }

}
