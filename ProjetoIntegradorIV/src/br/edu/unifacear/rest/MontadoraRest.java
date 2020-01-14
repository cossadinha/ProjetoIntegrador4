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
import br.edu.unifacear.entity.Montadora;
import io.swagger.annotations.Api;

@Path("/montadorarest")
@Api("/montadorarest")
public class MontadoraRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Montadora> listar() {
		Dao<Montadora> montadoraDao = FabricaDao.criarMontadoraDao();
		List<Montadora> mon = montadoraDao.listar();
		return mon;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Montadora montadora) {
		try {
			new BusinessFacade().inserirMontadora(montadora);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
