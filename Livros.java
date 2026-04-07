public class Livros extends Produto{
    private String autor;

    public Livros(String nome, float preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }
    public Livros(){}

    //GET e SET
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Autor: " + autor;
    }

}
