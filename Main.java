import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        calculadora cal = new calculadora(2, 5);
        cal.Soma();
        cal.Subtracao();
        cal.multiplicacao();
        cal.divisao();

    }
}
