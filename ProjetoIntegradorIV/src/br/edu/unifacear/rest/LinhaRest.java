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
import br.edu.unifacear.entity.Linha;

@Path("/linharest")
public class LinhaRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Linha> listar() {
		Dao<Linha> linhaDao = FabricaDao.criarLinhaDao();
		List<Linha> lin = linhaDao.listar();
		return lin;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Linha linha) {
		try {
			new BusinessFacade().inserirLinha(linha);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
