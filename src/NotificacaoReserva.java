import java.time.LocalDate;

public class NotificacaoReserva {
    private LocalDate data;
    private ReservaLivro reserva;

    public NotificacaoReserva(LocalDate data, ReservaLivro reserva) {
        this.data = data;
        this.reserva = reserva;
    }

    public LocalDate getData() {
        return data;
    }

    public ReservaLivro getReserva() {
        return reserva;
    }
}
