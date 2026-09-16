import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    double x,y,SUMA;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de x: ");
    x = sc.nextDouble();
    System.out.println("Ingrese el valor de SUMA: ");
    SUMA = sc.nextDouble();
    System.out.println("Ingrese el valor de y: ");
    y = sc.nextDouble();

    SUMA = suma.calculo1(SUMA, x);
    x = suma.calculo2( x, y);
    SUMA = suma.calculo3(SUMA, x, y);
    System.out.println("El resultado de la suma es: " + SUMA);
    }
}
