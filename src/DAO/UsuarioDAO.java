package DAO;

import MODEL.Usuario;

public class UsuarioDAO {

    public Usuario valida (Usuario usuario) {

        String nome = "ale";
        String senha = "123";

        if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha))
            usuario.setLogado(true);

        return usuario;
    }

}
