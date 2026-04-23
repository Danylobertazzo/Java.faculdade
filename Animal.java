public class Animal {
    private String nome;
    private int patas;
    private double velociadade;
    private int localizacao;

    public Animal(String nome, int patas, double velociadade, int localizacao) {//Construtor com parâmetros
        this.nome = nome;
        this.patas = patas;
        this.velociadade = velociadade;
        this.localizacao = localizacao;
    }
    public Animal(){}//Construtor vazio para permitir a criação de objetos sem parâmetros


    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public double getVelociadade() {
        return velociadade;
    }
    public void setVelociadade(double velociadade) {
        this.velociadade = velociadade;
    }
    public int getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    //Método para mover o animal
    public void mover() {
        System.out.println("Animal " + this.nome +" se movendo ----->");
        this.localizacao++;
    }


    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", patas=" + patas + ", velociadade=" + velociadade + ", localizacao="
                + localizacao + "]";
    }   

    

}
