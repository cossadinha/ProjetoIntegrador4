package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Montadora;

public class MontadoraBusiness {

	
public void inserir(Montadora montadora) throws BusinessException{
		
		if (montadora.getNome() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
			
		Dao<Montadora> MontadoraDao = FabricaDao.criarMontadoraDao();
		MontadoraDao.inserir(montadora);
	}
}
