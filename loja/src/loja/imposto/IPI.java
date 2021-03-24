package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class IPI extends Imposto{

	public IPI(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected BigDecimal aplicarImposto(PedidoInterface pedido) {
		return BigDecimal.ZERO;
	}

}
