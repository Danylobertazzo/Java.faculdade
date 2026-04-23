public class Ave extends Animal{
    
    public Ave(){
        super();
    }
    public Ave(String nome, int patas, double velociadade, int localizacao) {
        super(nome, patas, velociadade, localizacao);
    }

    public void mover(){
        System.out.println("Ave" + this.getNome() + " voando *****>");
        int localAtual = getLocalizacao();
        localAtual += 3;
        super.setLocalizacao(localAtual);
        //super.setLocalizacao(super.getLocalizacao() + 3);//Versão compact
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
