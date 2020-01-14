package br.edu.unifacear.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Modelo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAplicacao;
	private String descricao;
	private Boolean status;
	@ManyToOne (cascade=CascadeType.ALL)
	private Montadora montadora;
	@OneToOne(cascade=CascadeType.ALL)
	private Linha linha;
	
	public Integer getIdAplicacao() {
		return idAplicacao;
	}
	public void setIdAplicacao(Integer idAplicacao) {
		this.idAplicacao = idAplicacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	public Linha getLinha() {
		return linha;
	}
	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	
	
	
	
}
