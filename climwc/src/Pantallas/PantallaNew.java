package Pantallas;

import models.Developer;
import models.DAO.DeveloperDAO;

public class PantallaNew extends Pantalla {

	public PantallaNew(String nombrePantalla, String tituloPantalla) {
		super(nombrePantalla, tituloPantalla);
	}

	@Override
	public void dibujar(String[] args) {
		Developer develop = new Developer(args[1],args[2],args[3],args[4],args[5]);
		DeveloperDAO.newDeveloper(develop);
	}
	
	public boolean comprobarArgumentos(String args[]) {
		if(args.length < 6) {
			return false;
		}
		return true;
	}

}
