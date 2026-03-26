import javax.naming.LimitExceededException;

public class Conta {
    //Atributos da classe
    private double saldo;
    private String nome;
    private double limite;
    private static int numero;

    //getter e setters  ---> NOME <---
    public void setNome(String nome){//set recebe new name
        if(nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }
    public String getNome(){//get devolve nome
        return this.nome;
    }

    //getter e setters  ---> NUMERO <---
    public void setNumero(int numero){
        //condição que deve ter digitos
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    //getter e setters  ---> LIMITE <---
    public void setLimite(double limite){
        //condição que deve ter digitos
        if(limite > 0){
            this.limite = limite;
        }
    }
    public double getLimite(){
        //condição que deve ter digitos
        return this.limite = limite;
        
    }

    //getter e setters  ---> SALDO <---
    public void setsaldo(double saldo){
        //condição que deve ter digitos
        if(saldo <= limite || saldo >= 0){
            this.saldo = saldo;
        }
        
    }
    public double getsaldo(){
        return this.saldo;
    }

    
    


    public boolean sacarVerifica(double valor){
        if(valor > saldo && valor <= 0){
            return false;
        }else{
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return true;
        }
    }

        

    public String toString(){
        return "Nome: "+ this.nome +" | Num.:"  + this.numero + " | Saldo:" + this.saldo + " | Limite: " + this.limite;
    }
}

