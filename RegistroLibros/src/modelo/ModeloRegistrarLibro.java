package modelo;

public class ModeloRegistrarLibro {

    ArchivoTexto objArch;

    public void registrar(String isbn, String titulo, String autor) {

        Libro obj = new Libro();
        obj.setIsbn(isbn);
        obj.setTitulo(titulo);
        obj.setAutor(autor);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "libros.txt");
        this.objArch.crearLinea(obj.toString());
        this.objArch.cerrarArchivo('w');
    }
}