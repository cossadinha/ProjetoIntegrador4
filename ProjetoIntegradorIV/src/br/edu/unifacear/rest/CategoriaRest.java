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
import br.edu.unifacear.entity.Categoria;
import io.swagger.annotations.Api;

@Path("/categoriarest")
@Api("/categoriarest")
public class CategoriaRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> listar() {
		Dao<Categoria> categoriaDao = FabricaDao.criarCategoriaDao();
		List<Categoria> cat = categoriaDao.listar();
		return cat;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Categoria categoria) {
		try {
			new BusinessFacade().inserirCategoria(categoria);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
