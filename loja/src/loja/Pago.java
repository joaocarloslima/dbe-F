package loja;

public class Pago extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para logisca");
	}

	@Override
	public void entregar(PedidoInterface pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());

	}
	
	

}
