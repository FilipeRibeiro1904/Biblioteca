import java.time.LocalDate;

public class ReservaLivro {
    private LocalDate data;
    private Requisicao requisicao;

    public ReservaLivro(LocalDate data, Requisicao requisicao) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public LocalDate getData() {
        return data;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }
}
