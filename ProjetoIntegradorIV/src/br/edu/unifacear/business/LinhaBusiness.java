package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Linha;

public class LinhaBusiness {
public void inserir(Linha linha) throws BusinessException{
		
		if (linha.getDescricao() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
			
		Dao<Linha> LinhaDao = FabricaDao.criarLinhaDao();
		LinhaDao.inserir(linha);
	}

}
