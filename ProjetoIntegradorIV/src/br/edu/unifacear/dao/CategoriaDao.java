package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Categoria;

public class CategoriaDao implements Dao<Categoria>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Categoria categoria) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();		
	}
	
	public void alterar(Categoria categoria) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(categoria);
		em.getTransaction().commit();	
	}
	
	public void excluir(Categoria categoria) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(categoria));
		em.getTransaction().commit();	
	}
	
	public List<Categoria> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Aplicacao a");
		return q.getResultList();
	}
	
	public Categoria buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Categoria.class, id);
	}
	
}
