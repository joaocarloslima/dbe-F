package loja;

import java.math.BigDecimal;

public class Pedido implements PedidoInterface {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	public PedidoHandler handler;
//	private String cep;
	
	@Override
	public String getEndereco() {
		String endereco = "Rua 123, Sao Paulo";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return endereco;
		
	}
	
	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado();
	}
	
	@Override
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	@Override
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
	
	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}

	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}

	@Override
	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	@Override
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	@Override
	public void setSituacao(Situacao situacao) {
		handler.notificar(this);
		this.situacao = situacao;
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}
	
	

}
