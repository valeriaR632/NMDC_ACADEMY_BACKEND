package nmdc.nmdc.controller;
import nmdc.nmdc.model.Pago;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nmdc.nmdc.service.PagoService;


@RestController
@RequestMapping(path="/api/pago/")//http:localhost:8080/api/pago/
public class PagoController {

private final PagoService service;
@Autowired
public PagoController(PagoService service) {
	this.service=service;
}//get
@GetMapping
public  List<Pago>getPago(){
	return service.getPayment();
}//getPayment
@GetMapping(path="{paId}")//http:localhost:8080/api/pago/1
public Pago getPayment(@PathVariable("paId") Long id) {
	return (Pago) service.getPayment();
}
@DeleteMapping(path="{paId}")//http:localhost:8080/api/pago/1
public Pago deletePago(@PathVariable("paId") Long id) {
	return service.deletePayment(id);
}//deletePayment



@PostMapping
public Pago addPayment(@RequestBody Pago pago) {
	return service.addPayment(pago);
}//addUser
@PutMapping(path="{paId}")//http:localhost:8080/api/usuario/1
public Pago updatePago(@PathVariable("paId") Long id,
@RequestParam (name="costo", required=false) String costo,
@RequestParam (name="paquete", required=false) String paquete,
@RequestParam (name="fechaPago", required=false) String fechaPago)
 {
	return service.udpatePayment(id, costo, paquete, fechaPago);
	
}
}