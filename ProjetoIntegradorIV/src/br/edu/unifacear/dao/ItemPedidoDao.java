package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import br.edu.unifacear.entity.ItemPedido;

public class ItemPedidoDao implements Dao<ItemPedido>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(ItemPedido itempedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(itempedido);
		em.getTransaction().commit();		
	}
	
	public void alterar(ItemPedido itempedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(itempedido);
		em.getTransaction().commit();	
	}
	
	public void excluir(ItemPedido itempedido) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(itempedido));
		em.getTransaction().commit();	
	}
	
	public List<ItemPedido> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select itp from ItemPedido itp");
		return q.getResultList();
	}
	
	public ItemPedido buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(ItemPedido.class, id);
	}
}
