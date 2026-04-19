package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase maneja la persistencia de datos en archivos planos (.txt)
 */
public class ArchivoTexto {
    // Definición de objetos para manejo de archivos
    private File fichero;
    private FileWriter writer;
    private PrintWriter pw;
    private FileReader reader;
    private BufferedReader buffer;

    /**
     * Abre el archivo en modo lectura ('r') o escritura ('w')
     */
    public void abrirArchivoTexto(char modo, String nombreArchivo) {
        try {
            fichero = new File(nombreArchivo);
            
            if (modo == 'w') {
                // El parámetro 'true' indica que los nuevos datos se añaden al final (Append)
                writer = new FileWriter(fichero, true);
                pw = new PrintWriter(writer);
            } else {
                reader = new FileReader(fichero);
                buffer = new BufferedReader(reader);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, "Error al abrir el archivo", ex);
        }
    }

    /**
     * Escribe una línea de texto en el archivo
     */
    public void crearLinea(String linea) {
        if (pw != null) {
            pw.println(linea);
        }
    }

    /**
     * Lee todas las líneas del archivo y las devuelve en una matriz
     * ideal para llenar un JTable
     */
    public Object[][] obtenerMatrizLineas(int numColumnas) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            String linea;
            // Leemos línea por línea hasta el final del archivo
            while ((linea = buffer.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, "Error al leer el archivo", ex);
        }

        // Creamos la matriz con el tamaño de la lista de líneas
        Object[][] matrizDatos = new Object[lineas.size()][numColumnas];
        
        for (int i = 0; i < lineas.size(); i++) {
            // Dividimos cada línea por comas (CSV) para llenar las columnas
            matrizDatos[i] = lineas.get(i).split(",");
        }
        return matrizDatos;
    }

    /**
     * Cierra los flujos de datos para liberar memoria y asegurar que se guarde
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
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, "Error al cerrar el archivo", ex);
        }
    }
}