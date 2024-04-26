import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opcion  = 0;
        double valor = 0;
        String menu = """
            **************************************************
            Sea Bienvenido(a) al conversor de Monedas
            
            1) Dollar >>>> a Pesos argentinos
            2) Peso argentino >>>> a Dólar
            3) Dólar >>>> a Real brasileño
            4) Real brasileño >>>> a Dólar
            5) Dólar >>>> a Peso colombiano
            6) Peso colombiano >>>> a Dólar
            7) Salir
            
            Elija una opción válida=
             **************************************************
            """;
        Scanner teclado= new Scanner(System.in);
        while (opcion !=7 ){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el monto en dólares: ");
                    valor = teclado.nextDouble();
                    double dolarApesoArgentino = 873.50;
                    double convertirValor = valor * dolarApesoArgentino;
                    System.out.printf("%.2f dolares es igual a  %.2f Pesos argentino.%n", valor, convertirValor);
                    break;
                case 2:
                    System.out.print("Ingrese el monto en Pesos argentinos: ");
                    valor = teclado.nextDouble();
                    double pesoArgaDolar= 0.0011;
                    double ConPeAr = valor * pesoArgaDolar;
                    System.out.printf("%.2f pesos argentinos es igual a  %.2f dolares.%n", valor, ConPeAr);
                    break;
                case 3:
                    System.out.print("Ingrese el monto en dólares: ");
                    valor = teclado.nextDouble();
                    double dolarArealBra = 5.16;
                    double convDolares = valor * dolarArealBra;
                    System.out.printf("%.2f dolares es igual a  %.2f real brasileño.%n", valor, convDolares);
                    break;
                case 4:
                    System.out.print("Ingrese el monto en reales brasileros: ");
                    valor = teclado.nextDouble();
                    double realBraDol= 0.19;
                    double ConRbDol = valor * realBraDol;
                    System.out.printf("%.2f reales brasileros es igual a  %.2f dolares.%n", valor, ConRbDol);
                    break;
                case 5:
                    System.out.print("Ingrese el monto en dólares: ");
                    valor = teclado.nextDouble();
                    double dolarApesCol = 3954.56;
                    double convDol = valor * dolarApesCol;
                    System.out.printf("%.2f dolares es igual a  %.2f pesos colombianos.%n", valor, convDol);
                    break;
                case 6:
                    System.out.print("Ingrese el monto en Pesos colombianos: ");
                    valor = teclado.nextDouble();
                    double pesColaDol = 0.00025;
                    double convCol = valor * pesColaDol;
                    System.out.printf("%.2f pesos colombianos es igual a  %.2f dolares.%n", valor, convCol);
                    break;
                default:
                    System.out.println("Opcion Invalidad. Elija una opcion (1-7).");
                    break;
            }
        }
    }
}