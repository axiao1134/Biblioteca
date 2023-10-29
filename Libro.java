public class Libro {
	private String _nombreLibro;
	private String _autor;
	public Biblioteca _unnamed_Biblioteca_;
	public Prestamo _unnamed_Prestamo_;

	public String getNombreLibro() {
		return this._nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this._nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return this._autor;
	}

	public void setAutor(String autor) {
		this._autor = autor;
	}

	public Libro() {
		throw new UnsupportedOperationException();
	}
}