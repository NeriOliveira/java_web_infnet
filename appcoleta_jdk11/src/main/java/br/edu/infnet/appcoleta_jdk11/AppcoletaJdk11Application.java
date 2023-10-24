package br.edu.infnet.appcoleta_jdk11;

import java.sql.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;

@SpringBootApplication
public class AppcoletaJdk11Application {

	public static void main(String[] args) {
		SpringApplication.run(AppcoletaJdk11Application.class, args);
		
		Connection connection;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/igreenbd", "root", "root");
			
			
			Statement statement;
			statement = connection.createStatement();
			
			mostraUsuarios(statement);
//			alteraUsuario(statement);
			
			
		} catch (Exception exception){
			System.out.println(exception.toString());
		}
	}
	
	private static void mostraUsuarios(Statement statement) throws Exception {
		ResultSet resultSet;
		resultSet = statement.executeQuery("select * from usuario");
		
		Usuario usuario = null;
		while (resultSet.next()) {
			usuario.setId(resultSet.getInt("usuarioid"));
			usuario.setNome(resultSet.getString("usuarionome").trim());
			usuario.setEmail(resultSet.getString("usuarioemail").trim());
			usuario.setSenha(resultSet.getString("usuariosenha").trim());
			
			System.out.println("ID: " + usuario.getId() + " / Nome: " + usuario.getNome() + " / E-mail: " 
					+ usuario.getEmail() + " / Senha: " + usuario.getSenha());
		}
		System.out.println();
		resultSet.close();
	}
	
	private static void alteraUsuario(Statement statement) throws Exception{
		String command = "UPDATE usuario" + " SET nome = nome + 'testebd'" + " WHERE id = 2";
		
		statement.executeUpdate(command);
		
	}
	
}