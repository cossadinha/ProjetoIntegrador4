package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Montadora;

public class MontadoraTest {
	@Test
	public void deveriaCadastrarUmaMontadora() {
		
		Montadora mon = new Montadora();
		mon.setIdMontadora((Integer) null);
		mon.setNome("teste na aula");
		
		try {
			new BusinessFacade().inserirMontadora(mon);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , mon.getIdMontadora() != null);		
	}	

}
