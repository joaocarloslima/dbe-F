package loja;

import java.math.BigDecimal;

public class Pedido {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	public PedidoHandler handler;
	
	public void abrirChamado() {
		this.situacao.abrirChamado();
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}
	
	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}
	
	public void pagar() {
		this.situacao.pagar(this);
	}

	public void entregar() {
		this.situacao.entregar(this);
	}

	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	public void setSituacao(Situacao situacao) {
		handler.notificar(this);
		this.situacao = situacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}
	
	

}
