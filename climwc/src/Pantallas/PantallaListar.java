package Pantallas;

import java.util.ArrayList;

import models.Developer;
import models.DAO.DeveloperDAO;

public class PantallaListar extends Pantalla{

	public PantallaListar(String nombrePantalla, String tituloPantalla) {
		super(nombrePantalla, tituloPantalla);
	}

	public void dibujar(String[] args) {
		System.out.println(this.getTituloPantalla());
		System.out.println("");
		ArrayList<Developer> developers = DeveloperDAO.obtenerLista();
		for(Developer develop : developers) {
			System.out.println(develop.getName()+"   -----    "+develop.getDate());
		}
	}

}
