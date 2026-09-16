public class Calculos {
    public static double SalarioBruto(double horaslaboradas, double valorhora) {
        double salariobruto = horaslaboradas * valorhora;
        return salariobruto;
    }
    public static double Retefuente(double horaslaboradas, double valorhora, double porcentajeretefuente) {
        double retefuente = (horaslaboradas * valorhora) * porcentajeretefuente;
        return retefuente;
    }

    public static double SalarioNeto(double salariobruto, double retefuente) {
        return salariobruto - retefuente;
    }
}


