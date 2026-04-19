package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoTexto {
    File fichero;
    FileWriter writer;
    PrintWriter pw;
    FileReader reader;
    BufferedReader buffer;

    public void abrirArchivoTexto(char modo, String nombreArchivo) {
        try {
            fichero = new File(nombreArchivo);
            if (modo == 'w') {
                writer = new FileWriter(fichero, true);
                pw = new PrintWriter(writer);
            } else {
                reader = new FileReader(fichero);
                buffer = new BufferedReader(reader);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearLinea(String linea) {
        pw.println(linea);
    }

    public void cerrarArchivo(char modo) {
        try {
            if (modo == 'w') {
                if (pw != null) pw.close();
                if (writer != null) writer.close();
            } else {
                if (buffer != null) buffer.close();
                if (reader != null) reader.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[][] obtenerMatrizLineas(int numColumnas) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            String linea;
            while ((linea = buffer.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[][] matrizDatos = new Object[lineas.size()][numColumnas];
        for (int f = 0; f < lineas.size(); f++) {
            matrizDatos[f] = lineas.get(f).split(",");
        }
        return matrizDatos;
    }
}