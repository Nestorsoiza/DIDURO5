package disco;

public class EjecutableApp {

	public static void main(String[] args) {
		Serie listaSeries[] = new Serie[5];
		Videojuego listaVideojuegos[] = new Videojuego[5];
		
		listaSeries[0] = new Serie();
		listaSeries[1] = new Serie("Juego de tronos", "George R. R. Martin " );
		listaSeries[2] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
		listaSeries[3] = new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
		listaSeries[4] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
		
		listaVideojuegos[0] = new Videojuego();
		listaVideojuegos[1] = new Videojuego("Assasin creed 2", 30, "Aventura", "EA");
		listaVideojuegos[2] = new Videojuego("God of war 3", "Santa Monica");
		listaVideojuegos[3] = new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
		listaVideojuegos[4] = new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
		
		listaSeries[1].entregar();
		listaSeries[4].entregar();
		listaVideojuegos[0].entregar();
		listaVideojuegos[3].entregar();
		
		int entregado = 0;
		for (int i = 0; i < listaSeries.length; i++) {
			if (listaSeries[i].isEntregado()) {
				entregado += 1;
				listaSeries[i].devolver();				
			}
		
			if (listaVideojuegos[i].isEntregado()) {
				entregado += 1;
				listaVideojuegos[i].devolver();
			}
		}
		
		System.out.println("Hay " + entregado + " artículos entregados");
	}
}
