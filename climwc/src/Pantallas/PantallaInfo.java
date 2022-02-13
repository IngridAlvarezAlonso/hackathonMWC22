package Pantallas;

public class PantallaInfo extends Pantalla {

	private static final String TITULO_INFO = "MWC Barcelona 2022";
	private static final String FECHAS_INFO = "28 Febrero - 3 Marzo";
	
	public PantallaInfo(String nombrePantalla, String tituloPantalla) {
		super(nombrePantalla, tituloPantalla);
	}

	@Override
	public void dibujar(String[] args) {
		System.out.println(TITULO_INFO);
		System.out.println(FECHAS_INFO);
	}

}
