

public class Main {

    public static void main(String[] args) {
        //Hola chicos nadie cambie esto
        System.out.println("Hello Cami!");

        System.out.println("Ingrese su operacion");
        //TODO agregar scanner que lea la operacion
        String option = "sumar";
        while(!"salir".equals(option)){
            switch (option) {
                case "sumar":
                    suma();
                    break;
                case "multiplicar":
                    multi();
                    break;
                case "restar":
                    resta();
                    break;
                case "dividir":
                    div();
                    break;
                default:
                    System.out.println("Intente nuevamente!, Operaciones posible: ");
                    System.out.println("Sumar");
                    System.out.println("Restar");
                    System.out.println("Multiplicar");
                    System.out.println("Dividir");
                    break;
            }
            option = "salir";
        }
    }

    private static void suma () {

        int numero1;
        numero1 = 10;

        int numero2 = 20;

        int resultado = numero1 + numero2;
        System.out.println(resultado);

    }

    private static void resta () {

        int numero1;
        numero1 = 10;

        int numero2 = 20;

        int resultado = numero1 - numero2;
        System.out.println(resultado);

    }

    private static void multi () {

        int numero1;
        numero1 = 10;

        int numero2 = 20;

        int resultado = numero1 * numero2;
        System.out.println(resultado);

    }

    private static void div () {

        int numero1;
        numero1 = 10;

        int numero2 = 20;

        int resultado = numero1 / numero2;
        System.out.println(resultado);

    }
}
