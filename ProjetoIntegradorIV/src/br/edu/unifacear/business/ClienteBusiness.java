package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Cliente;

public class ClienteBusiness {
	
public void inserir(Cliente cliente) throws BusinessException{
		
		if (cliente.getNome() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
			
		Dao<Cliente> ClienteDao = FabricaDao.criarClienteDao();
		ClienteDao.inserir(cliente);
	}

}
