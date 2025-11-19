package SRP_VIOLACAO;

class ValidadorDeEstoque {
    public void validar(Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
        System.out.println("-> Validação de estoque OK.");
    }
}