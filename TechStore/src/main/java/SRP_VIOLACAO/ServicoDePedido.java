package SRP_VIOLACAO;

public class ServicoDePedido {
    private final ValidadorDeEstoque validador;
    private final CalculadoraDeValores calculadora;
    private final RepositorioDePedido repositorio;
    private final NotificadorDeEmail notificador;

    public ServicoDePedido(
            ValidadorDeEstoque validador,
            CalculadoraDeValores calculadora,
            RepositorioDePedido repositorio,
            NotificadorDeEmail notificador) {

        this.validador = validador;
        this.calculadora = calculadora;
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public double processar(Pedido pedido) throws Exception {
        validador.validar(pedido);
        double valorFinal = calculadora.calcularValorFinal(pedido);
        pedido.setPago(true);
        repositorio.salvar(pedido, valorFinal);
        notificador.enviarConfirmacao(pedido.getEmailCliente(), pedido.getId());

        return valorFinal;
    }
}
