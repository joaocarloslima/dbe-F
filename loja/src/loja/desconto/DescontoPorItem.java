package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class DescontoPorItem extends Desconto{

	public DescontoPorItem(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getQuantidadeDeItens() > 10;
	}
	
	

}
