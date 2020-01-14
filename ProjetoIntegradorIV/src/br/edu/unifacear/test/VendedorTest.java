package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Vendedor;

public class VendedorTest {

	@Test
	public void deveriaCadastrarUmVendedor() {
		
		Vendedor v = new Vendedor();
		v.setId_vendedor((Integer) null);
		v.setNome("me chupa");
		v.setStatus(true);
		
		try {
			new BusinessFacade().inserirVendedor(v);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , v.getId_vendedor() != null);		
	}	
} 	
