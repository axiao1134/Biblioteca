package modelo;

public class Libro {
	private String _nombreLibro;
	private String _autor;

	// Constructor por defecto
	public Libro(String datum, String s) {
		// Puedes inicializar variables o realizar acciones en el constructor si es necesario
	}

	// Métodos de acceso para el nombre del libro
	public String getNombreLibro() {
		return this._nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this._nombreLibro = nombreLibro;
	}

	// Métodos de acceso para el autor
	public String getAutor() {
		return this._autor;
	}

	public void setAutor(String autor) {
		this._autor = autor;
	}

	public String getNombre() {
		return null;
	}

	// Puedes agregar más métodos según las necesidades de tu aplicación
}
