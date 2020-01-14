package br.edu.unifacear.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_vendedor;
	
	private String nome;
	private int cpf;
	private boolean status;
	
	public Integer getId_vendedor() {
		return id_vendedor;
	}
	public void setId_vendedor(Integer id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
