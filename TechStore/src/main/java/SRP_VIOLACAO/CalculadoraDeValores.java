package SRP_VIOLACAO;

class CalculadoraDeValores {
    public double calcularValorFinal(Pedido pedido) {
        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }
        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;
        System.out.println("-> Cálculo de valores OK. Total: R$" + valorFinal);
        return valorFinal;
    }
}
