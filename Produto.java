public class Produto {
    private String nome;
    private float preco;

    //Construtores
    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(){}


    //GET e SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome +
                "Preco: " + preco;
    }
}
