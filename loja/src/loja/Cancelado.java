package loja;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para comercial");
	}

	@Override
	public void reabrir(PedidoInterface pedido) {
		pedido.setSituacao(new Aberto());
	}

}
