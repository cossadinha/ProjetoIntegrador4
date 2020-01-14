package br.edu.unifacear.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Peca {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPeca;
	private String nomePeca;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Categoria categoria;
	@ManyToOne(cascade=CascadeType.ALL)
	private Aplicacao aplicacao;
	@ManyToOne(cascade=CascadeType.ALL)
	private ItemPedido itempedido;
	private String pecaImagem;
	
	public Integer getIdPeca() {
		return idPeca;
	}
	public void setIdPeca(Integer idPeca) {
		this.idPeca = idPeca;
	}
	public String getNomePeca() {
		return nomePeca;
	}
	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Aplicacao getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(Aplicacao aplicacao) {
		this.aplicacao = aplicacao;
	}
	public ItemPedido getItempedido() {
		return itempedido;
	}
	public void setItempedido(ItemPedido itempedido) {
		this.itempedido = itempedido;
	}
	public String getPecaImagem() {
		return pecaImagem;
	}
	public void setPecaImagem(String pecaImagem) {
		this.pecaImagem = pecaImagem;
	}
	
	
	
}
