package modelo;

import java.util.Vector;

public class Usuario {
	private String _nombre;
	private String _rut;
	private int _numeroTelefono;
	private Biblioteca _biblioteca;  // Cambié el nombre de la variable
	private Vector<Prestamo> _prestamos = new Vector<>();

	// Constructor por defecto
	public Usuario() {
		// Puedes inicializar variables o realizar acciones en el constructor si es necesario
	}

	// Métodos de acceso para el nombre
	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String nombre) {
		this._nombre = nombre;
	}

	// Métodos de acceso para el rut
	public String getRut() {
		return this._rut;
	}

	public void setRut(String rut) {
		this._rut = rut;
	}

	// Métodos de acceso para el número de teléfono
	public int getNumeroTelefono() {
		return this._numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this._numeroTelefono = numeroTelefono;
	}

	// Métodos de acceso para la biblioteca
	public Biblioteca getBiblioteca() {
		return _biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this._biblioteca = biblioteca;
	}

	// Puedes agregar más métodos según las necesidades de tu aplicación
}
