package gestaobiblioteca.model.view;

import gestaobiblioteca.model.Usuario;

public class TelaUsuario {
    public static void main(String[] args){
        System.out.println("Bem vindo a tela de usuario");

        Usuario usuario1 = new Usuario() {

        };

        usuario1.setId(-2);
        System.out.println("ID do usuário: " + usuario1.getId());

    }
}
