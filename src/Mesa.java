public class Mesa extends Espaco{
    private Sala sala;

    public Mesa(int id, int nLugares, String estadoReserva, Sala sala) {
        super(id, nLugares, estadoReserva);
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }
}
