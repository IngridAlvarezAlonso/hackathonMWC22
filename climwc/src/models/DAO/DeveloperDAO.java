package models.DAO;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utils.Conexion;
import models.Developer;

//import Utils.Conexion;
//import models.Usuario;

public class DeveloperDAO {
	
	private static final String OBTENER_LISTA_TODOS_DEVELOPERS = "SELECT * FROM developers";
	private static final String CREAR_DEVELOPER = "INSERT INTO developers(name,email,category,phone,date) VALUES(?,?,?,?,?)";
	
	public static ArrayList<Developer> obtenerLista() {
		ArrayList<Developer> listaDevelopers = new ArrayList<Developer>();
		try {
			Conexion conn = Conexion.getInstance();
			PreparedStatement pstm = conn.getConnection().prepareStatement(OBTENER_LISTA_TODOS_DEVELOPERS);
			try {
				ResultSet rs = pstm.executeQuery();
				while(rs.next()) {
					String name = rs.getString("name");
					String email = rs.getString("email");
					String category = rs.getString("category");
					String phone = rs.getString("phone");
					String date = rs.getString("date");
					Developer develop = new Developer(name,email,category,phone,date);
					listaDevelopers.add(develop);
				}
				pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return listaDevelopers;
	}
	
	public static void newDeveloper(Developer developer) {
		try {
			Conexion conn = Conexion.getInstance();
			PreparedStatement pstm = conn.getConnection().prepareStatement(CREAR_DEVELOPER);
			try {
				pstm.setString(1, developer.getName());
				pstm.setString(2, developer.getEmail());
				pstm.setString(3, developer.getCategory());
				pstm.setString(4, developer.getPhone());
				pstm.setString(5, developer.getDate());
				int rs = pstm.executeUpdate();
				pstm.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
