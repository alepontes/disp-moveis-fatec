import CONTROLLER.UsuarioCONTROLLER;
import MODEL.Usuario;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Usuario usuario = new Usuario();
        UsuarioCONTROLLER usuarioContoller = new UsuarioCONTROLLER();


        String nome = JOptionPane.showInputDialog(null, "Informe o Nome","Login",  JOptionPane.QUESTION_MESSAGE);
        String senha = JOptionPane.showInputDialog(null, "Informe a Senha ","Login",  JOptionPane.QUESTION_MESSAGE);

        usuario.setNome(nome);
        usuario.setSenha(senha);

        usuario = usuarioContoller.validaLogin(usuario);


        if (usuario.getLogado())
            JOptionPane.showMessageDialog(null, "Usuario Logado", "Login", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Erro ao fazer Login", "Login", JOptionPane.ERROR_MESSAGE);

    }

}
