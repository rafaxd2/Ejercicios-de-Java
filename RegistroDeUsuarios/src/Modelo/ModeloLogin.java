package modelo;

public class ModeloLogin {
    ArchivoTexto objArch = new ArchivoTexto();

    public void registrarUsuario(String user, String pass) {
        Usuario u = new Usuario(user, pass);
        objArch.abrirArchivoTexto('w', "usuarios.txt");
        objArch.crearLinea(u.toString());
        objArch.cerrarArchivo('w');
    }

    public boolean validarLogin(String user, String pass) {
        objArch.abrirArchivoTexto('r', "usuarios.txt");
        // Obtenemos todos los usuarios (2 columnas: user y pass)
        Object[][] datos = objArch.obtenerMatrizLineas(2);
        objArch.cerrarArchivo('r');

        for (Object[] fila : datos) {
            if (fila[0].equals(user) && fila[1].equals(pass)) {
                return true; // Encontrado
            }
        }
        return false; // No existe o datos mal
    }
}