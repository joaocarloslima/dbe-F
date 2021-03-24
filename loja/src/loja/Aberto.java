package loja;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		new ChamadoFacade().abrir();
		System.out.println("Chamado para financeiro");		
	}

	@Override
	public void pagar(PedidoInterface pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	

}
