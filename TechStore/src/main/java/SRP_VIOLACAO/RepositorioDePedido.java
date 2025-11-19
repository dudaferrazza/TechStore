package SRP_VIOLACAO;

class RepositorioDePedido {
    public void salvar(Pedido pedido, double valorFinal) {
        System.out.println("-> Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
    }
}
