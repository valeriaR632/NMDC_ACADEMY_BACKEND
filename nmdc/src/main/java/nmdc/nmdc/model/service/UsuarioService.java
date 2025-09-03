package nmdc.nmdc.model.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.nmdc.model.Usuario;
@Service
public class UsuarioService {
	private final ArrayList<Usuario>lista=new ArrayList<Usuario>();
	@Autowired
	public UsuarioService() {
		lista.add(new Usuario("Valeria","Rojas","5540240228","valeriarojas@gmail.com","2025-08-01"));
		lista.add(new Usuario("Kassandra","Negrete","5522648900","kassandranegrete@gmail.com","2025-08-16"));
		lista.add(new Usuario("Lilia","Cardenas","5590765432","liliacardenas@gmail.com","2025-08-16"));
		lista.add(new Usuario("Sofia","Meza","1234567865","sofiameza@gmail.com","2025-09-01"));
		lista.add(new Usuario("Maria","Moreno","5502781034","mariamoreno@gmail.com","2025-08-12"));
	}//constructor
	public List<Usuario>getUser(){
		return lista;
	}//getUser
	public Usuario getUser(Long id) {
		Usuario tmpUse=null;
		for(Usuario use:lista) {
			if(use.getId()==id) {
				tmpUse=use;
				break;
			}//if
		}//foreach
		return tmpUse;
	}//getProduct
	public Usuario deleteUser(Long id) {
		Usuario tmpUse=null;
		for(Usuario use:lista) {
			if(use.getId()==id) {
				tmpUse=use;
				lista.remove(use);
				break;
			}//if
		}//foreach
		return tmpUse;
	}//deleteUser
	public Usuario addUser(Usuario usuario) {
		lista.add(usuario);
		return usuario;
	}//addUser
	public Usuario updateUser(Long id, String nombre, String apellido, String telefono, String correo,
			String fechaRegistro) {
		Usuario tmpUser=null;
		for(Usuario use:lista) {
			if(use.getId()==id) {
				if(nombre!=null)use.setNombre(nombre);
				if(apellido!=null)use.setApellido(apellido);
				if(telefono!=null)use.setTelefono(telefono);
				if(correo!=null)use.setCorreo(correo);
				if(fechaRegistro!=null)use.setFechaRegistro(fechaRegistro);
				tmpUser=use;
				break;
			}//if
		}//foreach
		return tmpUser;
		
	}

}
