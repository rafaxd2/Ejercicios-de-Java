package Controlador;

import Modelo.ArchivoInventario;
import Modelo.Producto;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import Modelo.ArchivoInventario;
import Modelo.Producto;


public class ControladorInventario {

    ArchivoInventario archivo;

    public ControladorInventario(String nombreArchivo) throws IOException {
        archivo = new ArchivoInventario(nombreArchivo);
    }

    // ── CREATE ────────────────────────────────────────────────────────────────
    public void guardar(int id, String nombre, String descripcion, int existencia) throws IOException {
        int pos = archivo.totalRegistros();
        Producto p = new Producto(id, nombre, descripcion, existencia, true);
        archivo.guardar(p, pos);
    }

    // ── READ ──────────────────────────────────────────────────────────────────
    public int totalRegistros() throws IOException {
        return archivo.totalRegistros();
    }

    public Producto leer(int pos) throws IOException {
        return archivo.leer(pos);
    }

    // ── UPDATE ────────────────────────────────────────────────────────────────
    public void actualizar(int idOriginal, int nuevoId, String nombre, String descripcion, int existencia) throws IOException {
        int total = archivo.totalRegistros();
        for (int i = 0; i < total; i++) {
            Producto p = archivo.leer(i);
            if (p != null && p.estado && p.id == idOriginal) {
                Producto pModificado = new Producto(nuevoId, nombre, descripcion, existencia, true);
                archivo.guardar(pModificado, i); // posición física 'i', no fila de tabla
                break;
            }
        }
    }

    // ── DELETE ────────────────────────────────────────────────────────────────
    public void eliminar(int idEliminar) throws IOException {
        int total = archivo.totalRegistros();
        for (int i = 0; i < total; i++) {
            Producto p = archivo.leer(i);
            if (p != null && p.estado && p.id == idEliminar) {
                p.estado = false; // borrado lógico
                archivo.guardar(p, i); // posición física 'i', no fila de tabla
                break;
            }
        }
    }

    // ── REPORTE ───────────────────────────────────────────────────────────────
    public void mostrarReporte(java.awt.Component parent) throws IOException {
        int total = archivo.totalRegistros();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-5s %-20s %-30s %-10s %-8s%n",
                "ID", "Nombre", "Descripción", "Exist.", "Estado"));
        sb.append("─".repeat(78)).append("\n");
        for (int i = 0; i < total; i++) {
            Producto p = archivo.leer(i);
            if (p != null) {
                sb.append(String.format("%-5d %-20s %-30s %-10d %-8s%n",
                        p.id, p.nombre.trim(), p.descripcion.trim(),
                        p.existencia, p.estado ? "ACTIVO" : "INACTIVO"));
            }
        }
        JTextArea area = new JTextArea(sb.toString());
        area.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new java.awt.Dimension(680, 350));
        JOptionPane.showMessageDialog(parent, scroll, "Reporte de Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
}
