import java.util.Vector;

public class Bbliotecario {
	private String _nombre;
	private String _rut;
	private String _direccion;
	private String _id;
	private Biblioteca _unnamed_Biblioteca_;
	private Vector<Prestamo> _prestamos = new Vector<Prestamo>();

	public Bbliotecario() {
		throw new UnsupportedOperationException();
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
}