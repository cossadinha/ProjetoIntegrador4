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
import br.edu.unifacear.entity.ItemPedido;
import io.swagger.annotations.Api;

@Path("/itempedidorest")
@Api("/itempedidorest")
public class ItemPedidoRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemPedido> listar() {
		Dao<ItemPedido> itempedidoDao = FabricaDao.criarItemPedidoDao();
		List<ItemPedido> itpe = itempedidoDao.listar();
		return itpe;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(ItemPedido itempedido) {
		try {
			new BusinessFacade().inserirItemPedido(itempedido);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
