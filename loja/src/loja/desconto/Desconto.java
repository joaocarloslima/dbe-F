package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}

	public BigDecimal calcular(Pedido pedido) {
		if (deveAplicar(pedido)) {
			aplicar(pedido);
		}
		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicar(Pedido pedido);

	protected abstract boolean deveAplicar(Pedido pedido);

}
