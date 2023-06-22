import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Contrato contrato = new Contrato(001, "Bla bla");

        try {
            contrato.MediaHorasTrabalhadas();
            System.out.println("Horas trabalhadas: " + contrato.MediaHorasTrabalhadas());
        } catch (Exception e) {
            System.out.println("Ainda não houve horas de trabalho registradas. ");
        }
        contrato.registrarHoras(12);
        contrato.registrarHoras(12);
        contrato.registrarHoras(8);

        try {
            contrato.MediaHorasTrabalhadas();
            System.out.println("Horas trabalhadas: " + contrato.MediaHorasTrabalhadas());
        } catch (Exception e) {
            System.out.println("Ainda não houve horas de trabalho registradas. ");
        }
    }
}
