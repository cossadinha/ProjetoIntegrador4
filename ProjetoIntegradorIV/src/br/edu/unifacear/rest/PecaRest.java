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
import br.edu.unifacear.entity.Peca;
import io.swagger.annotations.Api;

@Path("/pecarest")
@Api("/pecarest")
public class PecaRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Peca> listar() {
		Dao<Peca> pecaDao = FabricaDao.criarPecaDao();
		List<Peca> pecas = pecaDao.listar();
		return pecas;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Peca peca) {
		try {
			new BusinessFacade().inserir(peca);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}