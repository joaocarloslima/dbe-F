package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal aplicarImposto(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));		
	}

}
