public class CDs extends Produto{
    private int num_faixa;

    public CDs(String nome, float preco, int num_faixa){
        super(nome, preco);
        this.num_faixa = num_faixa;
    }

    public CDs(){}
    
    public int getNum_faixa() {
        return num_faixa;
    }
    public void setNum_faixa(int num_faixa) {
        this.num_faixa = num_faixa;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return super.toString() + "Numero faixa: " + num_faixa;
    }
}
