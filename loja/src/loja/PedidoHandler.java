package loja;

import java.util.ArrayList;
import java.util.List;

public class PedidoHandler {
	
	private List<Listeners> listeners;
	
	public PedidoHandler() {
		this.listeners = new ArrayList<Listeners>();
	}
	
	public void inscrever(Listeners listener) {
		listeners.add(listener);
	}
	
	public void desinscrever(Listeners listener) {
		listeners.remove(listener);
	}
	
	public void notificar(PedidoInterface pedido) {
		listeners.forEach(listener -> listener.update(pedido));
	}

}
