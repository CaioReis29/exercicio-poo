import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int idContrato;
    private String descricao;
    private List<Integer> horasTrabalhadas;


    public Contrato(int idContrato, String descricao) {
        this.idContrato = idContrato;
        this.descricao = descricao;
        this.horasTrabalhadas = new ArrayList();
    }

    public double MediaHorasTrabalhadas() throws ArithmeticException {
        int totalHoras = 0;
        int finalLista = this.horasTrabalhadas.size() -1;
        for (int i = finalLista; i >= finalLista; i--) {
            totalHoras = totalHoras + horasTrabalhadas.get(i);
        }
        double media = totalHoras / this.horasTrabalhadas.size();
        return media;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Integer> getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void registrarHoras(int quantHoras) {
        this.horasTrabalhadas.add(quantHoras);
    }
}
