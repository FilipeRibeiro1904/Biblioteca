public interface Repositorio {
    void adicionaCoima(Coima coima);
    void adicionaCopia(Copia copia);
    void adicionaDevolucao(Devolucao devolucao);
    void adicionaEmprestimo(Emprestimo emprestimo);
    void adicionaEncomenda(Encomenda encomenda);
    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void adicionaLivro(Livro livro);
    void adicionaNotificacao(Notificacao notificacao);
    void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    void adicionaRequisicao(Requisicao requisicao);
    void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);
    void adicionaRequisicaoCompraCopia(RequisicaoCompraCopia requisicaoCompraCopia);
    void adicionaRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro);
    void adicionaTipoUtilizador(TipoUtilizador tipo);
    void adicionaUtilizador(Utilizador utilizador);
    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
    void adicionaEspaco(Espaco espaco);
    void adiconaRequisicaoEspaco(RequisicaoEspaco requisicaoEspaco);
    void adicionaReservaLivro(ReservaLivro reservaLivro);
    void adicionaNotificacaoReserva(NotificacaoReserva notificacaoReserva);

}
