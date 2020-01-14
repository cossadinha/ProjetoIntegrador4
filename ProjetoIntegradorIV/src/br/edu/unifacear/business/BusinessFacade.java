package br.edu.unifacear.business;

import java.util.List;

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

public class BusinessFacade {
	public void inserir(Peca peca) throws BusinessException {
		new PecaBusiness().inserir(peca);
	}
	
	public List<Peca> listar() {
		return null; 
	}

	public void inserirAplicacao(Aplicacao aplicacao) throws BusinessException {
		new AplicacaoBusiness().inserir(aplicacao);
	}
	
	public List<Aplicacao> listarAplicacao() {
		return null; 
	}
	
	public void inserirCliente (Cliente c) throws BusinessException{
		new ClienteBusiness().inserir(c);
	}
	public List<Cliente> listarCliente(){
		return null;
	}
	
	public void inserirItemPedido (ItemPedido ip) throws BusinessException{
		new ItemPedido();
	}
	public List<ItemPedido> listarItemPedido(){
		return null;
	}
	
	public void inserirLinha (Linha l) throws BusinessException {
		new LinhaBusiness().inserir(l);
	}
	
	public List<Linha> listarLinha(){
		return null;
	}
	
	public void inserirModelo (Modelo m) throws BusinessException {
		new ModeloBusiness().inserir(m);
	}
	public List<Modelo> listarModelo(){
		return null;
	}
	
	public void inserirMontadora (Montadora mon) throws BusinessException {
		new MontadoraBusiness().inserir(mon);
	}
	public List<Montadora> listarMontadora(){
		return null;
	}
	
	public void inserirPedido (Pedido pe) throws BusinessException {
		new PedidoBusiness().inserir(pe);
	}
	public List<Pedido> listarPedido(){
		return null;
	}
	
	public void inserirVendedor (Vendedor v) throws BusinessException{
		new VendedorBusiness().inserir(v);
	}
	
	public void inserirCategoria (Categoria c) throws BusinessException{
		new CategoriaBusiness().inserir(c);
	}
	public List<Categoria> listarCategoria(){
		return null;
	}
}
