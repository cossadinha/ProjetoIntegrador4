package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Aplicacao;

public class AplicacaoTest {
	@Test
	public void deveriaCadastrarUmaAplicacao() {
		
		Aplicacao a = new Aplicacao();
		a.setIdAplicacao(null);
		a.setDescricao("Pesada");
		a.setStatus(true);
		
		try {
			new BusinessFacade().inserirAplicacao(a);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , a.getIdAplicacao() != null);		
	}	
}
