package modelo;

import java.util.Vector;

public class Prestamo {
	private Bibliotecario _bibliotecario;
	private Usuario _usuario;
	private Libro _libro;
	private String _fechaInicio;
	private String _fechaTermino;
	private Vector<Libro> _libros = new Vector<>();

	// Constructor por defecto
	public Prestamo(Usuario usuario, Libro libro, String fechaPrestamo, String fechaDevolucion) {
		// Puedes inicializar variables o realizar acciones en el constructor si es necesario
	}

	// Métodos de acceso para el bibliotecario
	public Bibliotecario getBibliotecario() {
		return this._bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this._bibliotecario = bibliotecario;
	}

	// Métodos de acceso para el usuario
	public Usuario getUsuario() {
		return this._usuario;
	}

	public void setUsuario(Usuario usuario) {
		this._usuario = usuario;
	}

	// Métodos de acceso para el libro
	public Libro getLibro() {
		return this._libro;
	}

	public void setLibro(Libro libro) {
		this._libro = libro;
	}

	// Métodos de acceso para la fecha de inicio
	public String getFechaInicio() {
		return this._fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this._fechaInicio = fechaInicio;
	}

	// Métodos de acceso para la fecha de término
	public String getFechaTermino() {
		return this._fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this._fechaTermino = fechaTermino;
	}

	// Puedes agregar más métodos según las necesidades de tu aplicación
}
