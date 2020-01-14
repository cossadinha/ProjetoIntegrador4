package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Aplicacao;
import br.edu.unifacear.entity.Peca;

public class PecaTest {
	@Test
	public void deveriaCadastrarUmaPeca() {
		
		Peca p = new Peca();
		p.setIdPeca((Integer) null);
		p.setNomePeca("Volante Surf");
		
		try {
			new BusinessFacade().inserir(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Aplicacao a = new Aplicacao();
		a.setIdAplicacao((Integer) null);
		a.setDescricao("Molhada");
		a.setStatus(true);
		
		
		try {
			new BusinessFacade().inserirAplicacao(a);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true,p.getIdPeca() != null);
		
	}	
}
