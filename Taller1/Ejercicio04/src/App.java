import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        double edadjuan;
        double edadalberto;
        double edadana;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE LA EDAD DE JUAN: ");
        edadjuan = entrada.nextDouble();
        edadalberto = Edades.calcularEdadAlberto((double) edadjuan);
        edadana = Edades.calcularEdadAna((double) edadjuan);
        double edadmama = Edades.calcularEdadMama((double) edadjuan, edadalberto, edadana);
        
        System.out.println("  LAS EDADES SON: ");
        System.out.println("ALBERTO: " + edadalberto + " JUAN: " + edadjuan);
        System.out.println("ANA: " + edadana + "     MAMA: " + edadmama);
    }
}
