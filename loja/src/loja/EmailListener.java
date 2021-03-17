package loja;

public class EmailListener implements Listeners{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviar email");
	}

}
