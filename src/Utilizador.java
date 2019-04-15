public class Utilizador {
    private String nome;
    private String estado;

    public Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }
}
