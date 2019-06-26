public class Sala  extends Espaco{
    private int piso;

    public Sala(int id, int nLugares, String estadoReserva, int piso) {
        super(id, nLugares, estadoReserva);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }
}
