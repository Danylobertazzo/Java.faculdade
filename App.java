import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ultilizando construor Cheio
        Carro car = new Carro("Gol", "preto", "AAA3E34", 2);
        
        System.out.println(car.toString());
        //Ultilizando construor Vazio
        Carro car2 = new Carro();

    }
}
