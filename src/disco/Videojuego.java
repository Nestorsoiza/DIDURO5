package disco;

public class Videojuego implements Entregable {
	private final static int NUM_HORASESTIMADAS_DEF = 100;
	private final static int MAYOR = 1;
	private final static int MENOR = -1;
	private final static int IGUAL = 0;
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	@Override
	public String toString() {
		return "Informacion del videojuego: \n" +
				"\tTitulo: " + titulo + "\n" +
				"\tHoras estimadas: " + horasEstimadas + "\n" +
				"\tGenero: " + genero + "\n" +
				"\tcompañia: " + compañia;
	}
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}
	public Videojuego() {
		this("",NUM_HORASESTIMADAS_DEF, "", "");
	}
	public Videojuego(String titulo, String compañia) {
		this(titulo, NUM_HORASESTIMADAS_DEF, "", compañia);
	}

	
}
