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
import br.edu.unifacear.entity.Cliente;
import io.swagger.annotations.Api;

@Path("/clienterest")
@Api("/clienterest")
public class ClienteRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listar() {
		Dao<Cliente> clienteDao = FabricaDao.criarClienteDao();
		List<Cliente> mon = clienteDao.listar();
		return mon;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Cliente cliente) {
		try {
			new BusinessFacade().inserirCliente(cliente);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
