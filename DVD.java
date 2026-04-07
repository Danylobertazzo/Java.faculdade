public class DVD extends Produto{
    private float duracao;


    public DVD(String nome, float ducarao, float preco){
        super(nome, preco);
        this.duracao = ducarao;
    }
    public DVD(){}
    //Getter e Setter
    public void setDuracao(float duracao){
        this.duracao = duracao;
    }
    public float getduracao(){
        return duracao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Duração: " + duracao;
    }

}