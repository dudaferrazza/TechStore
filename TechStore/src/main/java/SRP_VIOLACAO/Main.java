package SRP_VIOLACAO;

public class Main {
    public static void main(String[] args) {
        ValidadorDeEstoque validador = new ValidadorDeEstoque();
        CalculadoraDeValores calculadora = new CalculadoraDeValores();
        RepositorioDePedido repositorio = new RepositorioDePedido();
        NotificadorDeEmail notificador = new NotificadorDeEmail();

        ServicoDePedido processador = new ServicoDePedido(
                validador, calculadora, repositorio, notificador);

        Pedido pedido1 = new Pedido("PED-123", 600.00, 5, "cliente@email.com");

        try {
            double total = processador.processar(pedido1);

            System.out.println("\nResultado final: Pedido processado com sucesso! Total: R$" + total);
        } catch (Exception e) {
            System.out.println("\nErro ao processar pedido: " + e.getMessage());
        }
    }
}