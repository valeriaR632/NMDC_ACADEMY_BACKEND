package nmdc.nmdc.model;

public class Maestros {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String redSocial;
    private static long total=0;
    public Maestros(String nombre, String apellido, String telefono, String redSocial) {
    	super();
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.telefono = telefono;
    	this.redSocial =redSocial;
    Maestros.total++;
    this.id=Maestros.total;
    	}//constructor
    public Maestros() {
    	Maestros.total++;
    	this.id = Maestros.total;
    }//constructor vacio
	public Long getId() {
		return id;
	}//getid
	public void setId(Long id) {
		this.id = id;
	}//setid
	public String getNombre() {
		return nombre;
	}//getnombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//set nombre
	public String getApellido() {
		return apellido;
	}//get apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}//set apellido
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRedSocial() {
		return redSocial;
	}
	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}

	//getter and setter
	@Override
	public String toString() {
		return "Maestros [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", redSocial=" + redSocial + "]";
	}//toString
   
    
}//class Maestros
