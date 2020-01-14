package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Aplicacao;

public class AplicacaoDao implements Dao<Aplicacao>{

	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Aplicacao aplicacao) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aplicacao);
		em.getTransaction().commit();		
	}
	
	public void alterar(Aplicacao aplicacao) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(aplicacao);
		em.getTransaction().commit();	
	}
	
	public void excluir(Aplicacao aplicacao) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(aplicacao));
		em.getTransaction().commit();	
	}
	
	public List<Aplicacao> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Aplicacao a");
		return q.getResultList();
	}
	
	public Aplicacao buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Aplicacao.class, id);
	}
	
}
