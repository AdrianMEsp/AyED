package ejercicio3;

public class Estudiante {
	String nombre;
	String apellido;
	String comision;
	String email;
	String direccion;
	
	public Estudiante(String nombre,String apellido,String comision,String email,String direccion) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setComision(comision);
		this.setEmail(email);
		this.setDireccion(direccion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	
	public String tusDatos() {
		String cadena = "Nombre: "+this.getNombre()+"\n"+
				"Apellido: "+this.getApellido()+"\n"+
				"Email: "+this.getEmail()+"\n"+
				"Comision: "+this.getComision()+"\n"+
				"Direccion: "+this.getDireccion()+"\n";
		return cadena;
	}
	
}
