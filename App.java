public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Polimorfismo com Animais------\n");

        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Doguinho", 4, 5.5,2);//Instanciando 1 obj da classe Animal

        //Associar obj a posição do array
        animais[0] = doguinho;
        //Utilizadndo o obj de um array
        animais[0].mover();



        //DECLARE UM OBJ PEIXE NA MAIN E ASSOCIE ELE AO ARRAY DE ANIMAIS
        animais[1] = new Peixe("Peixe de Roca", 3 , 1.0, 5, 1);//Instanciando um obj da classe Peixe
        //animais[1].mover();
        for(Animal a: animais){
            a.mover();
        }

        //Implemente aclasseave - atributos idem animal

        animais[2] = new Ave("piracuco", 7, 12, 6);
        for(Animal a: animais){
            a.mover();
        }
    }
}
