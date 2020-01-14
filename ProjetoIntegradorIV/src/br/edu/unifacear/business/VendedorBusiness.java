package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Vendedor;

public class VendedorBusiness {
	
public void inserir(Vendedor vendedor) throws BusinessException{
		
		if (vendedor.getNome() == null) { 
			throw new BusinessException("Erro: nome não pode ser vazio");
		}
			
		Dao<Vendedor> VendedorDao = FabricaDao.criarVendedorDao();
		VendedorDao.inserir(vendedor);
	}

}
