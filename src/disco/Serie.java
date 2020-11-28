package disco;

public class Serie implements Entregable {
	private final static int NUM_TEMPORADAS_DEF = 3;
	private final static int MAYOR = 1;
	private final static int MENOR = -1;
	private final static int IGUAL = 0;
	private  String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void entregar() {
		entregado = true;
	}

	@Override
	public String toString() {
		return "Información de la Serie: \n" + "\tTitulo: " + titulo + "\n" 
				+ "\tNumeroDeTemporadas: " + numeroDeTemporadas + "\n"+ 
				"\tGenero: " + genero + "\tCreador: " + creador;
	}

	public Serie() {
		this("",NUM_TEMPORADAS_DEF, "", "");
	}

	public Serie(String titulo, String creador) {
		this(titulo,NUM_TEMPORADAS_DEF, "", creador);
	}

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
	
}
