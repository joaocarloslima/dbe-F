package loja;

import java.math.BigDecimal;

public interface PedidoInterface {

	String getEndereco();

	void abrirChamado();

	int getQuantidadeDeItens();

	BigDecimal getValor();

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	void setSituacao(Situacao situacao);

	Situacao getSituacao();

}