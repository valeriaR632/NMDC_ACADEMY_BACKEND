package nmdc.nmdc.model;

public class Pago {
	private Long id;
	private String costo;
	private String paquete;
	private String fechaPago;
	private static long total=0;
public Pago(String costo, String paquete,String fechaPago) {
super();
this.costo = costo;
this.paquete= paquete;
this.fechaPago = fechaPago;
Pago.total++;
this.id=Pago.total;
}//constructor
public Pago() {
	this.id = Pago.total;
}//constructor vacio
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCosto() {
	return costo;
}
public void setCosto(String costo) {
	this.costo = costo;
}
public String getPaquete() {
	return paquete;
}
public void setPaquete(String paquete) {
	this.paquete = paquete;
}
public String getFechaPago() {
	return fechaPago;
}
public void setFechaPago(String fechaPago) {
	this.fechaPago = fechaPago;
}//getters and setter
@Override
public String toString() {
	return "Pago [id=" + id + ", costo=" + costo + ", paquete=" + paquete + ", fechaPago=" + fechaPago + "]";
}//toString


}//classUsuario