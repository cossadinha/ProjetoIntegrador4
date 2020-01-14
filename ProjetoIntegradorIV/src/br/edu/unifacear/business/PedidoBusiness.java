package br.edu.unifacear.business;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Pedido;

public class PedidoBusiness {
	
public void inserir(Pedido pedido) throws BusinessException{
		
		if (pedido.getCliente().getCodCliente() == null) { 
			throw new BusinessException("Erro: Cliente não pode ser vazio");
		}
			
		Dao<Pedido> PedidoDao = FabricaDao.criarPedidoDao();
		PedidoDao.inserir(pedido);
	}

}
