package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Clase singleton:
public class Conexion {

	private static Conexion conexionSingleton;
	private Connection connection = null;
	
	public Conexion() {
		connection = crearConexion();
	}
	
	public static Conexion getInstance() {
		if(conexionSingleton == null) {
			conexionSingleton = new Conexion();
		}
		return conexionSingleton;
	}
	
	private Connection crearConexion() {
		try {
			connection = DriverManager.getConnection( "jdbc:sqlite:datos/mwc22.db" );
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return this.connection;
	}

	public Connection getConnection() {
		return connection;
	}
	
	//Para cerrar la Connection manualmente:
	public boolean cerrarConexion() {
		try {
			if(!this.getConnection().equals(null) && !this.getConnection().isClosed()) {
				this.getConnection().close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
