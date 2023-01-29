public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "1";
        switch (colorModeSelected) {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seeccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Bleu Dark Mode");
                break;
            case "Dark":
                System.out.println("Selecionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción que sea correcta");
        }
    }
    }

