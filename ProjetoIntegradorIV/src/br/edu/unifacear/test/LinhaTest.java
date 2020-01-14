package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Linha;

public class LinhaTest {
	@Test
	public void deveriaCadastrarUmaLinha() {
		
		Linha p = new Linha();
		p.setIdLinha(null);
		p.setDescricao("xurume");
		p.setStatus(true);
		p.setCategoria(12);
		
		try {
			new BusinessFacade().inserirLinha(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true,p.getIdLinha() != null);
		
	}	
}
