public class Peixe extends Animal {
    private int tipoAgua; // 0 = doce = 1 = salgada

    public Peixe() {
        super();
    }
    public Peixe(int tipoAgua) {this.tipoAgua = tipoAgua;}
    public Peixe(String nome, int patas, double velociadade, int localizacao, int tipoAgua) {
        super(nome, patas, velociadade, localizacao);//Atributos da super classe já [declarados]
        this.tipoAgua = tipoAgua;//Atributo da classe peixe
    }

    public int getTipoAgua() {
        return tipoAgua;
    }
    public void setTipoAgua(int tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void mover(){
        System.out.println("Peixe " + this.getNome() + " movendo ~~~~~>");
        int localAtual = getLocalizacao();
        localAtual += 2;
        super.setLocalizacao(localAtual);
        //super.setLocalizacao(super.getLocalizacao() + 2);//Versão compact
    }
    @Override
    public String toString() {
        return "Tipo agua: " + this.tipoAgua + "" + super.toString();
    }
}

