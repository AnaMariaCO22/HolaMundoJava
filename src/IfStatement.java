public class IfStatement {
    public static void main(String[] args) {
        boolean isBluethootEnable=true;
        int fileSend=3;

        if (isBluethootEnable){
        //Send File
            fileSend++;
            System.out.println("Archivo enviado");
            System.out.println(fileSend);
        }else {
            System.out.println("Por favor enciende tu bluetooth para iniciar la transferencia");
        }
    }
}
