package br.edu.unifacear.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.BusinessFacade;
import br.edu.unifacear.entity.Cliente;
import br.edu.unifacear.entity.Pedido;
import br.edu.unifacear.entity.Vendedor;

public class PedidoTest {
	@Test
	public void deveriaCadastrarUmPedido() {
		
// cliente
		
		Cliente c = new Cliente();
		c.setCodCliente((Integer) null);
		c.setNome("Joao");
		c.setCnpj(21321);
		c.setBairro("fsdfs");
		c.setEmail("32");
		c.setCidade("ds");
		c.setCpf(3232);
		c.setEndereco("fdsfsd");
		c.setTel(32);

		try {
			new BusinessFacade().inserirCliente(c);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//vendedor

		Vendedor v = new Vendedor();
		v.setId_vendedor((Integer) null);
		v.setNome("Joana");
		
		try {
			new BusinessFacade().inserirVendedor(v);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// pedido
		
		Pedido p = new Pedido();
		p.setIdPedido((Integer) null);
		
		
		
		p.setCliente( c );
		p.setStatus(true);
		p.setValor(10);
		
	
		
		p.setVendedor(v );
		
		try {
			new BusinessFacade().inserirPedido(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true , p.getIdPedido() != null);

	}	

}
