package gestaobiblioteca.model;

public class Aluno extends Usuario {
    public Aluno(long id, String nome, String email, String login, String senha, Perfil perfil){
        super(id, nome, email, login, senha, Perfil.ALUNO);
    }
}
