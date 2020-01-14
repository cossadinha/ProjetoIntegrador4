package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Vendedor;

public class VendedorDao implements Dao<Vendedor>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");

	public void inserir(Vendedor vendedor) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(vendedor);
		em.getTransaction().commit();
	}
	
	public void alterar(Vendedor vendedor) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(vendedor);
		em.getTransaction().commit();
	}
	
	public void excluir(Vendedor vendedor) {
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(vendedor));
		em.getTransaction().commit();
	}
	public List<Vendedor> listar(){
		EntityManager em= emf.createEntityManager();
		Query q = em.createQuery("select v from Vendedor v");
		return q.getResultList();
	}
	
	public Vendedor BuscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Vendedor.class, id);
	}

	@Override
	public Vendedor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
