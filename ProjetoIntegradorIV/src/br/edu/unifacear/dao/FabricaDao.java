package br.edu.unifacear.dao;

import br.edu.unifacear.entity.Aplicacao;
import br.edu.unifacear.entity.Categoria;
import br.edu.unifacear.entity.Cliente;
import br.edu.unifacear.entity.ItemPedido;
import br.edu.unifacear.entity.Linha;
import br.edu.unifacear.entity.Modelo;
import br.edu.unifacear.entity.Montadora;
import br.edu.unifacear.entity.Peca;
import br.edu.unifacear.entity.Pedido;
import br.edu.unifacear.entity.Vendedor;

public class FabricaDao {
	
	public static Dao<Peca> criarPecaDao() {
		return new PecaDao();
	}

	public static Dao<Aplicacao> criarAplicacaoDao() {
		return new AplicacaoDao();
	}

	public static Dao<Linha> criarLinhaDao() {
		return new LinhaDao();
	}
	
	public static Dao<Cliente> criarClienteDao() {
		return new ClienteDao();
	}
	
	public static Dao<ItemPedido> criarItemPedidoDao() {
		return new ItemPedidoDao();
	}
	
	public static Dao<Modelo> criarModeloDao() {
		return new ModeloDao();
	}
	
	public static Dao<Montadora> criarMontadoraDao() {
		return new MontadoraDao();
	}
	
	public static Dao<Pedido> criarPedidoDao() {
		return new PedidoDao();
	}
	
	public static Dao<Vendedor> criarVendedorDao() {
		return new VendedorDao();
	}
	public static Dao<Categoria> criarCategoriaDao(){
		return new CategoriaDao();
	}
}
