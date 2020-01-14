package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Pedido;



public class PedidoDao implements Dao<Pedido>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Pedido pedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		System.out.println("->>>>>>>>"+pedido);
		em.persist(pedido);
		em.getTransaction().commit();
	}
	public void alterar(Pedido pedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(pedido);
		em.getTransaction().commit();
	}
	public void excluir(Pedido pedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(pedido));
		em.getTransaction().commit();	
	}
	
	public List<Pedido> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select pd from Pedido pd");
		return q.getResultList();
	}
	
	public Pedido buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Pedido.class, id);
	}
	

}
	