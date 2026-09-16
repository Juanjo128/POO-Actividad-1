import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero,cubo,cuadrado;

        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
         numero = entrada.nextDouble();

         cuadrado = Operaciones.CalcularCuadrado(numero);
         cubo = Operaciones.CalcularCubo(numero);

         System.out.println("Numero:   "+numero);
         System.out.println("Cuadrado: "+cuadrado);
         System.out.println("Cubo    : "+cubo); 


    }
}
