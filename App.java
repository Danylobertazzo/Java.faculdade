public class App {
    public static void main(String[] args) throws Exception {
        Produto prod[] = new Produto[5];
        //Livros nome = new Livros("biblia", 100);
        
        prod[0] = new DVD("Diácono", 75, 100);
        prod[1] = new CDs("Denis Ronaldo", 75, 5);
        prod[2] = new Livros("Diácono", 75, "Jerobão");
        prod[3] = new CDs("Diácono", 75, 8);
        prod[4] = new Livros("Diácono", 75, "Jerson");

        System.out.println(prod[0].toString());
        System.out.println(prod[1].toString());
        System.out.println(prod[2].toString());
        System.out.println(prod[3].toString());
        System.out.println(prod[4].toString());
        

    }
}
