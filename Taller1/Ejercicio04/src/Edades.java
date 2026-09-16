public class Edades {
    public static double calcularEdadAlberto(double edadJuan) {
        return (2 * edadJuan) / 3;
    }
    public static double calcularEdadAna(double edadJuan) {
        return (4 * edadJuan) / 3;
    }
    public static double calcularEdadMama(double edadJuan, double edadAlberto, double edadAna) {
        return edadJuan + edadAlberto + edadAna;
    }

}
