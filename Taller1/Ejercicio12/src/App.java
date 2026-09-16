public class App {
    public static void main(String[] args) throws Exception {
        double horaslaboradas , valorhora , porcentajeretefuente , salariobruto , retefuente , salarioneto;
        horaslaboradas = 48;
        valorhora = 5000;
        porcentajeretefuente = 12.5/100;

        salariobruto = Calculos.SalarioBruto(horaslaboradas, valorhora);
        retefuente = Calculos.Retefuente(horaslaboradas, valorhora, porcentajeretefuente);
        salarioneto = Calculos.SalarioNeto(salariobruto, retefuente);

        System.out.println("El salario bruto es: " + salariobruto);
        System.out.println("El valor de la retefuente es: " + retefuente);
        System.out.println("El salario neto es: " + salarioneto);
    }
}
