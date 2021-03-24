package loja;

public class EmailListener implements Listeners{

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Enviar email");
	}

}
