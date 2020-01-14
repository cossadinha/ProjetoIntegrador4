package br.edu.unifacear.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Pedido;
import io.swagger.annotations.Api;

@Path("/pedidorest")
@Api("/pedidorest")
public class PedidoRest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pedido> listar() {
		Dao<Pedido> pedidoDao = FabricaDao.criarPedidoDao();
		List<Pedido> ped = pedidoDao.listar();
		return ped;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Pedido ped) {
		try {
			new BusinessFacade().inserirPedido(ped);;
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}

}
