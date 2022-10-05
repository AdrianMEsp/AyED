package Practica4Ejercicio5;

public class AreaEmpresa {
	private String id;
	private int tardanza;
	
	public AreaEmpresa() {
		
	}
	
	public AreaEmpresa(String id, int tarda) {
		this.tardanza=tarda;
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTardanza() {
		return tardanza;
	}
	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
	
	
}
