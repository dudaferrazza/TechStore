package SRP_VIOLACAO;

class NotificadorDeEmail {
    public void enviarConfirmacao(String email, String idPedido) {
        System.out.println("-> Email de confirmação enviado para: " + email + " | Pedido: " + idPedido);
    }
}