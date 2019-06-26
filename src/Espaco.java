public class Espaco {
    private int id;
    private int nLugares;
    private String estadoReserva;

    public Espaco(int id, int nLugares, String estadoReserva) {
        this.id = id;
        this.nLugares = nLugares;
        this.estadoReserva = estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public int getId() {
        return id;
    }

    public int getnLugares() {
        return nLugares;
    }

    public Espaco(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
}

