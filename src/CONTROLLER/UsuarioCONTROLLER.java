package CONTROLLER;

import DAO.UsuarioDAO;
import MODEL.Usuario;

public class UsuarioCONTROLLER {

    static UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario validaLogin(Usuario usuario){
        return usuarioDAO.valida(usuario);
    }

}
