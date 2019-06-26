import java.time.LocalDate;

public class RequisicaoEspaco {

    private Utilizador utilizador;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Espaco espaco;

    public RequisicaoEspaco(Utilizador utilizador, LocalDate dataInicio, LocalDate dataFim, Espaco espaco) {
        this.utilizador = utilizador;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.espaco = espaco;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Espaco getEspaco() {
        return espaco;
    }
}

