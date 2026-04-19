package modelo;

public class ModeloAgenda {
    // IMPORTANTE: Asegúrate de tener esta variable
    ArchivoTexto objArch = new ArchivoTexto();

    public void guardarEnArchivo(String nom, String tel, String mail) {
        // Creamos el contacto
        Contacto nuevo = new Contacto(nom, tel, mail);
        
        // Usamos los métodos de ArchivoTexto
        objArch.abrirArchivoTexto('w', "contactos.txt");
        objArch.crearLinea(nuevo.toString());
        objArch.cerrarArchivo('w');
    }
}