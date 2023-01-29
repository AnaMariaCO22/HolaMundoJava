public class Funcioes {
    /*
    *Linea 1
    * Linea 2
    * Linea 3
     */

    /**
     *Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param args Cantidad de dinero
     * @return Devuelve la cantidad actualizada e n dolares
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




    }

    /**
     * Descripción: Calcula el area de un circulo
     * @param r: El parametro del valor del radio
     * @return: Retorna el area total del circulo
     */
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
