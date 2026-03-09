package gestaobiblioteca.model;

public class Usuario{
    private int id;

    public void setID(int id) {
        if(id <= 0) {
            throw new IllegalArgumentException("id deve ser um numero positivo");

        }
        this.id = id;
    }
    
    public int getID(){
        return this.id;
    }
}