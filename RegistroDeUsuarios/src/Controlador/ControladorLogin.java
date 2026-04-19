package controlador;

import modelo.ModeloLogin;

public class ControladorLogin {
    ModeloLogin modelo = new ModeloLogin();

    public void registrar(String u, String p) {
        modelo.registrarUsuario(u, p);
    }

    public boolean ingresar(String u, String p) {
        return modelo.validarLogin(u, p);
    }
}