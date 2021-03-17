package loja;

public class Pago extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para logisca");
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());

	}
	
	

}
