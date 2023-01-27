public class Casting {
    public static void main(String[] args) {
        //En un año ubique 30 perros
        //Cuantos perros ubique al mes

        double mothlyDogs = 30.0/12.0;
        System.out.println(mothlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) mothlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);
        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short)n;
        System.out.println(nS);
    }
}
