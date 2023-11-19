package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Biblioteca {
	private List<Libro> _libros;  // Cambié el arreglo a una lista para mayor flexibilidad
	private Vector<Bibliotecario> _bibliotecarios = new Vector<>();
	private Vector<Usuario> _usuarios = new Vector<>();

	// Constructor de la clase
	public Biblioteca() {
		_libros = new ArrayList<>();
	}

	// Método para agregar un libro
	public void agregarLibro(Libro libro) {
		if (!libroExiste(libro)) {
			_libros.add(libro);
			System.out.println("Libro agregado con éxito");
		} else {
			System.out.println("El libro ya existe en la biblioteca");
		}
	}

	// Método para buscar un libro por nombre
	public Libro buscarLibro(String nombreLibro) {
		for (Libro libro : _libros) {
			if (libro.getNombre().equalsIgnoreCase(nombreLibro)) {
				return libro;
			}
		}
		return null;  // Devuelve null si no se encuentra el libro
	}

	// Método para obtener libros por autor
	public List<Libro> obtenerLibroPorAutor(String nombreAutor) {
		List<Libro> librosPorAutor = new ArrayList<>();
		for (Libro libro : _libros) {
			if (libro.getAutor().equalsIgnoreCase(nombreAutor)) {
				librosPorAutor.add(libro);
			}
		}
		return librosPorAutor;
	}

	// Método auxiliar para verificar si un libro existe
	private boolean libroExiste(Libro libro) {
		for (Libro l : _libros) {
			if (l.equals(libro)) {
				return true;
			}
		}
		return false;
	}

	// Método para generar un préstamo
	public Prestamo generarPrestamo(Usuario usuario, Libro libro, String fechaPrestamo, String fechaDevolucion) {
		Prestamo prestamo = new Prestamo(usuario, libro, fechaPrestamo, fechaDevolucion);
		// Aquí puedes realizar cualquier lógica adicional relacionada con el préstamo
		return prestamo;
	}

	public List<Libro> getLibros() {
		return _libros;
	}
}
