package gestaobiblioteca.model;

public abstract class Usuario implements Autenticavel{
    private int id;

    public void setId(int id) {
        if(id <= 0) {
            throw new IllegalArgumentException("id deve ser um numero positivo");

        }
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}