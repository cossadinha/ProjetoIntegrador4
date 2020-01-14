package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Linha;


public class LinhaDao implements Dao<Linha>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Linha linha) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(linha);
		em.getTransaction().commit();		
	}
	
	public void alterar(Linha linha) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(linha);
		em.getTransaction().commit();	
	}
	
	public void excluir(Linha linha) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(linha));
		em.getTransaction().commit();	
	}
	
	public List<Linha> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select l from Linha l");
		return q.getResultList();
	}
	
	public Linha buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Linha.class, id);
	}
}
