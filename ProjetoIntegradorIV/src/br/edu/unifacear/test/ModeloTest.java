package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Modelo;

public class ModeloTest {
	@Test
	public void deveriaCadastrarUmModelo() {
		
		Modelo m = new Modelo();
		m.setIdAplicacao(null);
		m.setDescricao("Modelo da puta que te pariu");
		m.setStatus(true);
		
		try {
			new BusinessFacade().inserirModelo(m);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , m.getIdAplicacao() != null);		
	}	
}
