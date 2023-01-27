public class IncrementDecrement {
    public static void main(String[] args) {
        int lives=5;
        lives=lives-1;
        System.out.println(lives);

        lives--; //Decremento
        System.out.println(lives);

        lives++; //Incremento
        System.out.println(lives);

        //prefija
        //gana un regalo por ganar una vida
        int gift =100 +lives++; //postfijo
        System.out.println(gift);
        System.out.println(lives); //5

        int gift2 =100 + ++lives; //prefijo
        System.out.println(gift2);
        System.out.println(lives); //6
    }
}
