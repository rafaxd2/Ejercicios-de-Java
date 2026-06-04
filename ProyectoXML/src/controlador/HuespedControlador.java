package controlador;

import modelo.ArchivoXML;
import modelo.Huesped;

public class HuespedControlador {

    private ArchivoXML archivo;

    public HuespedControlador() {

        archivo = new ArchivoXML();
    }

    public void guardar(Huesped h) {

        archivo.guardar(h);
    }

    public String listar() {

        return archivo.leer();
    }
}