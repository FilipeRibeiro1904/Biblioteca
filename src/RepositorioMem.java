import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    private static ArrayList<Emprestimo>  list_Emprestimo;
    private static ArrayList<Coima> list_Coima;
    private static ArrayList<Copia> list_Copia;
    private static ArrayList<Devolucao> list_Devolucao;
    private static ArrayList<Livro> list_Livro;
    private static ArrayList<Notificacao> list_Notificacao;
    private static ArrayList<Requisicao> list_Requisicao;
    private static ArrayList<TipoUtilizador> list_TipoUtilizador;
    private static ArrayList<Utilizador> list_Utilizador;
    private static ArrayList<Encomenda> list_Encomenda;
    private static ArrayList<EntradaNovoLivro> list_EntradaNovoLivro;
    private static ArrayList<PropostaAquisicao> list_PropostaAquisicao;
    private static ArrayList<RequisicaoCompra> list_RequisicaoCompra;
    private static ArrayList<RequisicaoCompraCopia> list_RequisicaoCompraCopia;
    private static ArrayList<RequisicaoCompraLivro> list_RequisicaoCompraLivro;
    private static ArrayList<Espaco> list_Espaco;
    private static ArrayList<RequisicaoEspaco> list_RequisicaoEspaco;
    private static ArrayList<ReservaLivro> list_ReservaLivro;
    private static ArrayList<NotificacaoReserva> list_NotificacaoReserva;


    public RepositorioMem() {
        list_Emprestimo = new ArrayList<Emprestimo>();
        list_Coima = new ArrayList<Coima>();
        list_Copia = new ArrayList<Copia>();
        list_Devolucao = new ArrayList<Devolucao>();
        list_Livro = new ArrayList<Livro>();
        list_Notificacao = new ArrayList<Notificacao>();
        list_Requisicao = new ArrayList<Requisicao>();
        list_TipoUtilizador = new ArrayList<TipoUtilizador>();
        list_Utilizador = new ArrayList<Utilizador>();
        list_Encomenda = new ArrayList<Encomenda>();
        list_EntradaNovoLivro = new ArrayList<EntradaNovoLivro>();
        list_PropostaAquisicao = new ArrayList<PropostaAquisicao>();
        list_RequisicaoCompra = new ArrayList<RequisicaoCompra>();
        list_RequisicaoCompraCopia = new ArrayList<RequisicaoCompraCopia>();
        list_RequisicaoCompraLivro = new ArrayList<RequisicaoCompraLivro>();
        list_Espaco = new ArrayList<Espaco>();
        list_RequisicaoEspaco = new ArrayList<RequisicaoEspaco>();
        list_ReservaLivro = new ArrayList<ReservaLivro>();
    }

    @Override
    public void adicionaCoima(Coima coima) {
        list_Coima.add(coima);
    }

    @Override
    public void adicionaCopia(Copia copia){
        list_Copia.add(copia);
    }

    @Override
    public void adicionaDevolucao(Devolucao devolucao){
        list_Devolucao.add(devolucao);
    }

    @Override
    public void adicionaEmprestimo(Emprestimo emprestimo){
        list_Emprestimo.add(emprestimo);
    }

    @Override
    public void adicionaEncomenda(Encomenda encomenda){
        list_Encomenda.add(encomenda);
    }

    @Override
    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){
        list_EntradaNovoLivro.add(entradaNovoLivro);
    }

    @Override
    public void adicionaLivro(Livro livro){
        list_Livro.add(livro);
    }

    @Override
    public void adicionaNotificacao(Notificacao notificacao){
        list_Notificacao.add(notificacao);
    }

    @Override
    public void adicionaPropostaRequisicao(PropostaAquisicao proposta){
        list_PropostaAquisicao.add(proposta);
    }

    @Override
    public void adicionaRequisicao(Requisicao requisicao) {
        list_Requisicao.add(requisicao);
    }

    @Override
    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){
        list_RequisicaoCompra.add(requisicaoCompra);
    }

    @Override
    public void adicionaRequisicaoCompraCopia(RequisicaoCompraCopia requisicaoCompraCopia){
        list_RequisicaoCompraCopia.add(requisicaoCompraCopia);
    }

    @Override
    public void adicionaRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro){
        list_RequisicaoCompraLivro.add(requisicaoCompraLivro);
    }

    @Override
    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        list_TipoUtilizador.add(tipo);
    }

    @Override
    public void adicionaUtilizador(Utilizador utilizador){
        list_Utilizador.add(utilizador);
    }


    @Override
    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for (Emprestimo emprestimo: list_Emprestimo){
            if(emprestimo.getRequisicao().equals(r)){
                return emprestimo;
            }
        }
        return null;
    }

    @Override
    public void adicionaEspaco(Espaco espaco) {
        list_Espaco.add(espaco);
    }

    @Override
    public void adiconaRequisicaoEspaco(RequisicaoEspaco requisicaoEspaco) {
        list_RequisicaoEspaco.add(requisicaoEspaco);
    }

    @Override
    public void adicionaReservaLivro(ReservaLivro reservaLivro) {
        list_ReservaLivro.add(reservaLivro);

    }

    @Override
    public void adicionaNotificacaoReserva(NotificacaoReserva notificacaoReserva) {
        list_NotificacaoReserva.add(notificacaoReserva);

    }


}
