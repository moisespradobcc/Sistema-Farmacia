package br.com.farmacia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public static final String USUARIO = "root";
	public static final String SENHA = "";
	public static final String URL = "jdbc:mysql://localhost:3306/sistema?useSSL=false&useTimezone=true&serverTimezone=UTC";

	public static Connection conectar() throws SQLException {
		// Referência ao Driver mysql para versões antigas do java
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	public static void main(String[] args) {
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("Conectado com Sucesso");
		} catch (SQLException ex) {
			System.out.println("Conexão Falhou");
			ex.printStackTrace();
		}

	}
}
