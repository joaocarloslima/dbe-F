package loja.desconto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal aplicar(PedidoInterface pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		return true;
	}

}
