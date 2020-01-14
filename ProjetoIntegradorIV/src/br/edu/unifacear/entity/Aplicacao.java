package br.edu.unifacear.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Aplicacao {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer idAplicacao;
		private String descricao;
		private Boolean status;

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
}
