package br.edu.unifacear.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.unifacear.entity.Montadora;


public class MontadoraDao  implements Dao<Montadora>{
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("vendas");
		
		public void inserir(Montadora montadora) {
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			em.persist(montadora);
			em.getTransaction().commit();
		}
		public void alterar(Montadora montadora) {
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			em.merge(montadora);
			em.getTransaction().commit();
		}
		public void excluir(Montadora montadora) {
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			em.remove(em.merge(montadora));
			em.getTransaction().commit();	
		}
		
		public List<Montadora> listar() {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select mt from Montadora mt");
			return q.getResultList();
		}
		
		public Montadora obterPorModelo(Integer id) {
			EntityManager em = emf.createEntityManager();
			return em.find(Montadora.class, id);
		}
		@Override
		public Montadora buscarPorId(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}
		

}
