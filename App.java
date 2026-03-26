import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);//Iniciando as entradas
        Conta conta1= new Conta();
        
        //Solicita nome
        System.out.println("Tipe your name: ");
        String nome = input.next();//lendo nome
        conta1.setNome(nome); //usando set (altera o valor)
        
        
        //Solicita numero conta
        System.out.println("Type numero conta: ");
        int numero = input.nextInt();//lendo nome]
        conta1.setNumero(numero);


        //Solicita saldo
        System.out.println("Type numero limite: ");
        double saldo = input.nextDouble();
        conta1.setsaldo(saldo);

        
        //Solicita limite
        System.out.println("Type Saldo: ");
        double limite = input.nextDouble();
        conta1.setLimite(limite);

        System.out.println("O nome digitado é: " + conta1.getNome());
        System.out.println("Numero da conta: " + conta1.getNumero());
        System.out.println("Limite: " + conta1.getLimite());
        System.out.println("Saldo: " + conta1.getsaldo());
        
        //Conta 2
        Conta conta2 = new Conta();
        conta2.setNumero(6);
        //Visualiza contas
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        Conta conta3 = new Conta();
        System.out.println(conta3.toString());

        input.close();//fecha o Scanner
    }
}
