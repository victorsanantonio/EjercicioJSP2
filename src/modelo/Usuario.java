package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_rol", nullable = false)
	private int id_rol;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name = "clave", nullable = true)
	private String clave;
	
	@Column(name = "nombre", nullable = true)
	private String nombre;
	
	@Column(name = "apellido1", nullable = true)
	private String apellido1;
	
	@Column(name = "apellido2", nullable = true)
	private String apellido2;
	
	@Column(name = "direccion", nullable = true)
	private String direccion;
	
	@Column(name = "localidad", nullable = true)
	private String localidad;
	
	@Column(name = "provincia", nullable = true)
	private String provincia;
	
	@Column(name = "telefono", nullable = true)
	private String telefono;
	
	@Column(name = "dni", nullable = true)
	private String dni;
	
	public Usuario() {}
	
	public Usuario(int id, int id_rol, String email, String clave, String nombre, String apellido1, String apellido2,
			String direccion, String localidad, String provincia, String telefono, String dni) {
		super();
		this.id = id;
		this.id_rol = id_rol;
		this.email = email;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.telefono = telefono;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_rol=" + id_rol + ", email=" + email + ", clave=" + clave + ", nombre="
				+ nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", provincia=" + provincia + ", telefono=" + telefono + ", dni=" + dni
				+ "]";
	}
}
