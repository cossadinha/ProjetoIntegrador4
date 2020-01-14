package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Cliente;

public class ClienteTest {
	@Test
	public void deveriaCadastrarUmCliente() {
		
		Cliente c = new Cliente();
		c.setCodCliente((Integer) null);
		c.setNome("Jão Gameply");
		
		try {
			new BusinessFacade().inserirCliente(c);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , c.getCodCliente() != null);		
	}	

}
