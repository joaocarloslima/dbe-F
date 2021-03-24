package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class CalculadoraDeImposto {
	
	private Imposto imposto;

	public CalculadoraDeImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}


	public BigDecimal calcular(PedidoInterface pedido) {
		return imposto.calcular(pedido);
	}

}
