package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class DescontoPorItem extends Desconto{

	public DescontoPorItem(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getQuantidadeDeItens() > 10 ) {
			return pedido.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(pedido);
	}
	
	

}
