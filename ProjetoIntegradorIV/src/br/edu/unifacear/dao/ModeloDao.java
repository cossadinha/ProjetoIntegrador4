package br.edu.unifacear.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Modelo;

public class ModeloDao implements Dao<Modelo>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
	
	public void inserir(Modelo modelo) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(modelo);
		em.getTransaction().commit();
	}
	
	public void alterar(Modelo modelo) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(modelo);
		em.getTransaction().commit();			
	}
	
	public void excluir(Modelo modelo) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(modelo);
		em.getTransaction().commit();
	}
	
	public List<Modelo> listar(){
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select md from Modelo md");
		return q.getResultList();
	}
	
	public Modelo listarPorMontadora(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Modelo.class, id);
	}

	@Override
	public Modelo buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
