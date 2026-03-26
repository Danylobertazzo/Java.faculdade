import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FuncApp conta1 = new FuncApp();

        //Solicita nome
        System.out.println("Nome: ");
        String nome = input.next();
        conta1.setNome(nome); 

        //Solicita DEPARTAMENTO
        System.out.println("Departament where do you work: ");
        String departamento = input.next();
        conta1.setDepartamento(departamento); 

        //Solicita Salário
        System.out.println("Departament where do you work: ");
        String salario = input.next();
        conta1.setSalario(salario); 


        System.out.println("O nome digitado é: " + conta1.getNome());
        System.out.println("Departamento: " + conta1.getDepartamento());
        System.out.println("Salário: " + conta1.getSalario());
        
    }
}
