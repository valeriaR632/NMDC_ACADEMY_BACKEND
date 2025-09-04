package nmdc.nmdc.controller;

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

import nmdc.nmdc.model.Maestros;

import nmdc.nmdc.model.service.MaestrosService;

@RestController
@RequestMapping(path="/api/maestros")//http:localhost:8080/api/maestros/
public class MaestrosController {
	@SuppressWarnings("unused")
	private final MaestrosService service;
	@Autowired
	public MaestrosController(MaestrosService service) {
		this.service=service;
	}//get
	@GetMapping
	public List<Maestros>getMaestros(){
		return service.getTeacher();
		}//getMaestros
	@GetMapping(path="{useId")//http:localhost:8080/api/maestros/1
	public Maestros getMaestros(@PathVariable("useId") Long id) {
		return service.getTeacher(id);
	}
	@DeleteMapping(path="{useId}")//http:localhost:8080/api/maestros/1
	public Maestros deleteMaestros(@PathVariable("useId") Long id) {
		return service.deleteTeacher(id);
}//deleteTeacher
	@PostMapping
	public Maestros addMaestros(@RequestBody Maestros maestros) {
		return service.addTeacher(maestros);
}//addUser
	@PutMapping(path="{useId}")//http:localhost:8080/api/maestros/1
	public Maestros updateMaestros(@PathVariable("useId") Long id,
	@RequestParam (required=false) String nombre,
	@RequestParam (required=false) String apellido,
	@RequestParam (required=false) String telefono,
	@RequestParam (required=false) String redSocial) {
		return service.updateTeacher(id,nombre,apellido,telefono,redSocial);
	}
}
