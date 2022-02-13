//package models.DAO;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//
//import com.google.gson.Gson;
//
//import models.Developer;
//
////import Utils.Conexion;
////import models.Usuario;
//
//public class DeveloperDAOJSON {
//	
//	private static final String FILE_PATH = "C:\\Users\\ingri\\eclipse-workspace\\climwc\\datos\\mwc22.json";
//	
//	public static ArrayList<Developer> obtenerLista() {
//		Gson gson = new Gson();
//		String
//		
//		InputStream is = JSONPointer.class.getResourceAsStream(FILE_PATH);
//		if (is == null) {
//            throw new NullPointerException("Cannot find resource file " + FILE_PATH);
//        }
//		ArrayList<Developer> listaDevelopes = new ArrayList<Developer>();
//		try {
//			JSONObject jsonFile = new JSONObject(FILE_PATH);
//			String firstName = jsonFile.getString("name");
//			System.out.println(firstName);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return listaDevelopes;
//	}
//}
