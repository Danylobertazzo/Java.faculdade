public class calculadora {
    private int N1;
    private int N2;



    public int getN1(){return this.N1;}
    public void setN1(int N1){
        this.N1 = N1;
    }

    public int getN2(){return this.N2;}
    public void setN2(int N2){
        this.N2 = N2;
    }

    public int Soma(){
        return this.N1 + this.N2;
    }
    public int Subtracao(){
        if(this.N1 < this.N2){ return this.N1 - this.N2;}else{return this.N2 - this.N1;}
    }
    public Double multiplicacao(){
        return this.N1 * this.N2;
    }
    public Double divisao(){
        return this.N1 / this.N2;
    }

    public String toString(){
        return "--Calculadora--"
                + "\n Soma:" + this.Soma
                + "\n Subtracao:" + this.Subtracao
                + "\n multiplicacao:" + this.multiplicacao
                + "\n divisao:" + this.divisao;
    }
}
