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
import br.edu.unifacear.entity.Modelo;

@Path("/modelorest")
public class ModeloRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Modelo> listar() {
		Dao<Modelo> modeloDao = FabricaDao.criarModeloDao();
		List<Modelo> mode = modeloDao.listar();
		return mode;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Modelo modelo) {
		try {
			new BusinessFacade().inserirModelo(modelo);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
