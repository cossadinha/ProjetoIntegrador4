package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.ItemPedido;

public class ItemPedidoTest {
	@Test
	public void deveriaCadastrarUmItemPedido() {
		
		ItemPedido ip = new ItemPedido();
		ip.setIdAplicacao((Integer) null);
		ip.setDescricao("abc");
		
		try {
			new BusinessFacade().inserirItemPedido(ip);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , ip.getIdAplicacao() != null);		
	}	
}
