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
public class Montadora {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMontadora;
	private String descricao;
	private String nome;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Modelo modelos;
	
	public Integer getIdMontadora() {
		return idMontadora;
	}
	public void setIdMontadora(Integer idMontadora) {
		this.idMontadora = idMontadora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Modelo getModelos() {
		return modelos;
	}
	public void setModelos(Modelo modelos) {
		this.modelos = modelos;
	}
	
	
	
	
}
