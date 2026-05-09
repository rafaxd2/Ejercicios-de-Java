package clases;
import java.io.*;
import java.util.ArrayList;

public class ArchivoInventario {

    private String archivo = "inventario.dat";

    public ArrayList<Producto> leerTodos() {
        ArrayList<Producto> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Producto>) ois.readObject();
        } catch (Exception e) {}
        return lista;
    }

    private void guardar(ArrayList<Producto> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregar(Producto p) {
        ArrayList<Producto> lista = leerTodos();
        lista.add(p);
        guardar(lista);
    }

    public boolean eliminar(int id) {
        ArrayList<Producto> lista = leerTodos();
        for (Producto p : lista) {
            if (p.getId() == id && p.isEstado()) {
                p.setEstado(false);
                guardar(lista);
                return true;
            }
        }
        return false;
    }

    public boolean modificar(int id, String n, String d, int e) {
        ArrayList<Producto> lista = leerTodos();
        for (Producto p : lista) {
            if (p.getId() == id && p.isEstado()) {
                p.setNombre(n);
                p.setDescripcion(d);
                p.setExistencia(e);
                guardar(lista);
                return true;
            }
        }
        return false;
    }
    
    public Producto buscar(int id) {
        for (Producto p : leerTodos()) {
            if (p.getId() == id && p.isEstado()) {
                return p;
            }
        }
        return null;
    }
    
    
}
