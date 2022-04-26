package br.com.farmacia.test;

import java.sql.SQLException;
import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;
import java.util.ArrayList;
import org.junit.Ignore;
import org.junit.Test;

public class ProdutoDAOTeste {

	@Test
	@Ignore
	public void salvar() throws SQLException {
		Produtos p = new Produtos();
		p.setDescricao("CATAFLAN");
		p.setPreco(10.50);
		p.setQuantidade(12L);

		Fornecedores f = new Fornecedores();
		f.setCodigo(12L);
		p.setFornecedores(f);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.salvar(p);
	}

	@Test
	@Ignore
	public void listar() throws SQLException {
		ProdutoDAO pdao = new ProdutoDAO();
		ArrayList<Produtos> lista = pdao.listar();

		for (Produtos p : lista) {
			System.out.println("Código do Produto: " + p.getCodigo());
			System.out.println("Descrição do Produto: " + p.getDescricao());
			System.out.println("Valor do Produto: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Código Fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Descrição do Fornecedor: " + p.getFornecedores().getDescricao());
			System.out.println("");
		}
	}

	@Test
	public void excluir() throws SQLException {
		Produtos p = new Produtos();
		p.setCodigo(3L);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.excluir(p);

	}

	@Test
	@Ignore
	public void editar() throws SQLException {
		Produtos p = new Produtos();
		p.setCodigo(1L);
		p.setDescricao("BENEGRIPE");
		p.setPreco(5.30);
		p.setQuantidade(10L);

		Fornecedores f = new Fornecedores();
		f.setCodigo(12L);
		p.setFornecedores(f);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.editar(p);

	}

}