import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double radio,area,longitud;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = entrada.nextDouble();


        area = operaciones.CalcularArea(radio);
        longitud = operaciones.CalcularLongitud(radio);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del circulo es: " + longitud);  
    }
}
