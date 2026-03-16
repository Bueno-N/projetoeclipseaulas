package gestaobiblioteca.model;

import java.util.List;

public class Professor extends Usuario{

    private long id;
    private String nome;
    private List<Disciplina> disciplinas;
    



    public Professor(long id, String nome, String email, String login, String senha, Perfil perfil){
        super(id, nome, email, login, senha, Perfil.PROFESSOR);
    }
}