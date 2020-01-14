package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Categoria;

public class CategoriaBusiness {
	
	public void inserir(Categoria categoria)throws BusinessException{
		
		if (categoria.getNome() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
			
		Dao<Categoria> CategoriaDao = FabricaDao.criarCategoriaDao();
		CategoriaDao.inserir(categoria);
	}
}
