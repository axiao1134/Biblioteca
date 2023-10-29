import java.util.Vector;

public class Prestamo {
	private String _bibliotecario;
	private String _usuario;
	private String _libro;
	private String _fechaInicio;
	private String _fechaTermino;
	private Vector<Libro> _libros = new Vector<Libro>();

	public Prestamo() {
		throw new UnsupportedOperationException();
	}

	public String getBibliotecario() {
		return this._bibliotecario;
	}

	public void setBibliotecario(String bibliotecario) {
		this._bibliotecario = bibliotecario;
	}

	public String getUsuario() {
		return this._usuario;
	}

	public void setUsuario(String usuario) {
		this._usuario = usuario;
	}

	public String getLibro() {
		return this._libro;
	}

	public void setLibro(String libro) {
		this._libro = libro;
	}

	public String getFechaInicio() {
		return this._fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this._fechaInicio = fechaInicio;
	}

	public String getFechaTermino() {
		return this._fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this._fechaTermino = fechaTermino;
	}
}