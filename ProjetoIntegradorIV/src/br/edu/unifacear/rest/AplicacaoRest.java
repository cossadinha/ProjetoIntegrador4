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
import br.edu.unifacear.entity.Aplicacao;
import io.swagger.annotations.Api;

@Path("/aplicacaorest")
@Api("/aplicacaorest")
public class AplicacaoRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aplicacao> listar() {
		Dao<Aplicacao> aplicacaoDao = FabricaDao.criarAplicacaoDao();
		List<Aplicacao> mon = aplicacaoDao.listar();
		return mon;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Aplicacao aplicacao) {
		try {
			new BusinessFacade().inserirAplicacao(aplicacao);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
