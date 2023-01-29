public class Funcioes {
    /*
    *Linea 1
    * Linea 2
    * Linea 3
     */

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        double y=3;

        //Area de un circulo
        //pi*r2
        double area = circleArea(y);
        System.out.println(area);
        //El área de una esfera
        //4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));
        //(4/3)*PI*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));
        System.out.println("PESOS A DOLARES "+convertToDolar(1000,"COP") );



    }
    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double esfera(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public static double volumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
//En este caso se declaran static porque el metodo main es static y solo ´puede llamar metodos estaticos

}
