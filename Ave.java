public class Ave extends Animal{
    
    public Ave(){
        super();
    }
    public Ave(String nome, int patas, double velociadade, int localizacao) {
        super(nome, patas, velociadade, localizacao);
    }

    public void mover(){
        setLocalizacao(getLocalizacao() + 3);//Preciso entender melhor isso
        System.out.println("Ave" + this.getNome() + " voando *****>");
        int localAtual = getLocalizacao();
        localAtual += 3;
        super.setLocalizacao(localAtual);
        //super.setLocalizacao(super.getLocalizacao() + 3);//Versão compact
    }
    @Override
    public String toString() {
        return   ", Nome()=" + getNome() +
                 ", Patas()=" + getPatas() +
                 ", Velociadade()="+ getVelociadade() +
                 ", Localizacao()=" + getLocalizacao() + "]";
    }

}