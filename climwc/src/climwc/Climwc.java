package climwc;


import Pantallas.Pantalla;
import Pantallas.PantallaInfo;
import Pantallas.PantallaListar;
import Pantallas.PantallaNew;

public class Climwc {
	private Pantalla pantallaListar;
	private Pantalla pantallaInfo;
	private Pantalla pantallaNew;
	
	public static void main(String [] args) {
//		System.out.println(args [0]);
		
		Climwc climwc = new Climwc();
		climwc.inicializar();
		climwc.comprobarArgs(args);
	}

	private void inicializar() {
		pantallaListar = new PantallaListar("pantallaListar","Lista");
		pantallaInfo = new PantallaInfo("pantallaInfo","Info");
		pantallaNew = new PantallaNew("pantallaNewDeveloper","New developer");
	}

	private void comprobarArgs(String[] args) {
		if(args.length >= 1) {
			switch(args[0]) {
			case "listar":
				pantallaListar.dibujar(args);
				break;
			case "info":
				pantallaInfo.dibujar(args);
				break;
			case "new":
				boolean argsCorrectos = ((PantallaNew) pantallaNew).comprobarArgumentos(args);
				if(argsCorrectos) {
					pantallaNew.dibujar(args);
				}else {
					System.out.println("ERROR: Has de pasarle mas argumentos");
				}
			}
		}else if(args.length > 1){
			//TODO: "ERROR --> Solo puede tener un argumento.
		}else if(args.length < 1) {
			//TODO: "ERROR --> Ha de tener un ragumento
		}
		
	}
}
