public class FuncApp {
    //Atributos da classe
    private double salario;
    private String data;
    private String RG;
    private String nome;
    private String departamento;


    //getter e setters  ---> NOME <---
    public void setNome(String nome){//set recebe new name
        if(nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }
    public String getNome(){//get devolve nome
        return this.nome;
    }

    //getter e setters  ---> DEPARTAMENTO <---
    public void setDepartamento(String departamento){
        //departamento tem que ser igual a 4 nomes, 
    }
    public String getDepartamento(){//get devolve nome
        return this.departamento;
    }

    //getter e setters  ---> Salário <---
    public void setSalario(double salario){
        if(salario >= 1200){
            this.salario = salario;
        } 
    }
    public String setSalario(){//get devolve nome
        return this.salario;
    }




}
