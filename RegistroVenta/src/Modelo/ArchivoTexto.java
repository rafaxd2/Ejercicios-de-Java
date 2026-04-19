package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoTexto {
    private File fichero;
    private FileWriter writer;
    private PrintWriter pw;
    private FileReader reader;
    private BufferedReader buffer;

    /**
     * Abre el archivo en modo escritura ('w') o lectura ('r')
     */
    public void abrirArchivoTexto(char modo, String nombreArchivo) {
        try {
            fichero = new File(nombreArchivo);
            
            if (modo == 'w') {
                // true permite escribir al final del archivo sin borrar lo anterior
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

    /**
     * Guarda una línea de texto (los datos del producto separados por comas)
     */
    public void crearLinea(String linea) {
        if (pw != null) {
            pw.println(linea);
        }
    }

    /**
     * Lee el archivo y lo convierte en una matriz para la JTable
     */
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
        
        for (int i = 0; i < lineas.size(); i++) {
            // Separa el texto por cada coma encontrada
            matrizDatos[i] = lineas.get(i).split(",");
        }
        return matrizDatos;
    }

    /**
     * Cierra el archivo para guardar los cambios y liberar memoria
     */
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
}