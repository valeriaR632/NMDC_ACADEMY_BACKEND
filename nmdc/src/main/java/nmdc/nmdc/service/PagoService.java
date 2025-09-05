package nmdc.nmdc.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.nmdc.model.Pago;

@Service
public class PagoService {
	private final ArrayList<Pago>lista=new ArrayList<Pago>();
	@Autowired
	public PagoService() {
		lista.add(new Pago("700", "anual","2025-08-01"));
		lista.add(new Pago("130", "suelta","2025-08-12"));
		lista.add(new Pago("700", "anual", "2025-08-16"));
		lista.add(new Pago("130", "suelta", "2025-08-16"));
		lista.add(new Pago("700", "anual","2025-09-01"));
	}//constructor
	public List<Pago>getPayment(){
		return lista;
	}//getPayment
	public Pago deletePayment(Long id) {
		Pago tmpPa=null;
		for(Pago pa:lista) {
			if(pa.getId()==id) {
				tmpPa=pa;
				lista.remove(pa);
				break;
			}//if
		}//foreach
		return tmpPa;
	}//deleteUser
	public Pago addPayment(Pago pago) {
		lista.add(pago);
		return pago;
	}//addpayment
	public Pago udpatePayment(Long id, String costo, String Paquete, String FechaPago) {
		Pago tmpPayment=null;
		for(Pago pa:lista){
			if(pa.getId()==id) {
				if(costo!=null)pa.setCosto(costo);
				if(Paquete!=null)pa.setPaquete(Paquete);
				if(FechaPago!=null)pa.setFechaPago(FechaPago);
				tmpPayment=pa;
				break;
				
			}//if
		}//foreach
		return tmpPayment;
	}
	}