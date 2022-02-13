package Pantallas;

public abstract class Pantalla {
	
	private String nombrePantalla;
	private String tituloPantalla;
	
	public Pantalla (String nombrePantalla, String tituloPantalla) {
		this.nombrePantalla = nombrePantalla;
		this.tituloPantalla = tituloPantalla;
	}
	
	public abstract void dibujar(String[] args);
	
	public String setTituloPantalla() {
		return tituloPantalla;
	}
	
	public String getTituloPantalla() {
	    return tituloPantalla;
	}

   public String setNombrePantalla() {
		return nombrePantalla;

   }
   
}
