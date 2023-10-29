import java.util.Vector;

public class Usuario {
	private String _nombre;
	private String _rut;
	private int _numeroTelefono;
	public Biblioteca _unnamed_Biblioteca_;
	private Vector<Prestamo> _prestamos = new Vector<Prestamo>();

	public Usuario() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String nombre) {
		this._nombre = nombre;
	}

	public String getRut() {
		return this._rut;
	}

	public void setRut(String rut) {
		this._rut = rut;
	}

	public int getNumeroTelefono() {
		return this._numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this._numeroTelefono = numeroTelefono;
	}
}