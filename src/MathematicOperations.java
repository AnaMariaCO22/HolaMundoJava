public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //devuelve la potencia
        System.out.println(Math.pow(x,y));
        //devuelve el dato mayor
        System.out.println(Math.max(x,y));
        //devuelve la ra{iz cuadrada
        System.out.println((int)Math.sqrt(y));
        //Area de un circulo
        //pi*r2
        System.out.println(Math.PI*Math.pow(y,2));
        //El área de una esfera
        //4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));
        //(4/3)*PI*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));



    }
}
