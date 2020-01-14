package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Aplicacao;

public class AplicacaoBusiness {

	public void inserir(Aplicacao aplicacao) throws BusinessException{
		
		if (aplicacao.getDescricao() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
			
		Dao<Aplicacao> AplicacaoDao = FabricaDao.criarAplicacaoDao();
		AplicacaoDao.inserir(aplicacao);
	}
}
