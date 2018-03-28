package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConsulta {
	public static void main(String[] args) throws SQLException {
		// pega a conexão e o Statement

		Connection con = new ConnectionFactory().getConnection();
		String sql = "select * from contatos";

		PreparedStatement stmt = con.prepareStatement(sql);

		// executa um select
		ResultSet rs = stmt.executeQuery();
		
		// itera no ResultSet
		while (rs.next()) {
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			String endereco = rs.getString("endereco");
			Date dataNascimento = rs.getDate("dataNascimento");
			
			System.out.println(nome + " | " + email + " | " + endereco + " | " + dataNascimento);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
}
