package modelo;

import java.util.Vector;

class Bibliotecario {
	private String _nombre;
	private String _rut;
	private String _direccion;
	private String _id;
	private Biblioteca _biblioteca;  // Cambié el nombre de la variable
	private Vector<Prestamo> _prestamos = new Vector<>();

	public Bibliotecario() {
		// Puedes inicializar variables u realizar acciones en el constructor si es necesario
	}

	public String getId() {
		return this._id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String direccion) {
		this._direccion = direccion;
	}

	public String getRut() {
		return this._rut;
	}

	public void setRut(String rut) {
		this._rut = rut;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String nombre) {
		this._nombre = nombre;
	}

	public Biblioteca getBiblioteca() {
		return _biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this._biblioteca = biblioteca;
	}

	// Puedes agregar más métodos según las necesidades de tu aplicación
}
