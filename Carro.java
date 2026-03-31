public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int portas;

    public Carro(){}

    public Carro(String tipo, String cor, String placa, int portas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.portas = portas;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
       
    // SET = guardar um valor no atributo
    public void setCor(String cor) {
        this.cor = cor; // "tranca a gaveta com esse valor"
    }

    // GET = pegar o valor do atributo
    public String getCor() {
        return this.cor; // "abre a gaveta e mostra o valor"
    }
        
    public void setPortas(int portas) {
        if(portas == 2 || portas == 4) { // só aceita 2 ou 4
            this.portas = portas;
        }
    }
        
    public int getPortas(){
        return this.portas;  // ✅
    }

    public String toString(){
        return "--CARRO--"
                + "\n Tipo:" + this.tipo
                + "\n Cor:" + this.cor
                + "\n Porta:" + this.portas
                + "\n Placa:" + this.placa;
    }
}
