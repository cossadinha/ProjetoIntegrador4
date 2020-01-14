package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Cliente;

public class ClienteDao implements Dao<Cliente>{

	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Cliente cliente) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		System.out.println(cliente);
		try {
			em.persist(cliente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("---ERRO "+e.getMessage());
		}
		System.out.println("Ok"+cliente);
	}
	public void alterar(Cliente cliente) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}
	public void excluir(Cliente cliente) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(cliente));
		em.getTransaction().commit();	
	}
	
	public List<Cliente> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select c from Cliente c");
		return q.getResultList();
	}
	
	public Cliente buscarPorCodCliente(Integer codCliente) {
		EntityManager em = emf.createEntityManager();
		return em.find(Cliente.class, codCliente);
	}	
	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
