package nmdc.nmdc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.nmdc.model.Maestros;
@Service
public class MaestrosService {

	private final ArrayList<Maestros>lista=new ArrayList<Maestros>();
	@Autowired
	public MaestrosService() {
		lista.add(new Maestros("Pablo","López", "326472746", "@pabloL"));
		lista.add(new Maestros("Indigo","Valenzuela", "6555384736", "@indigoV"));
		lista.add(new Maestros("Zhevia","Kings", "8827462535", "@zheviakings"));
		lista.add(new Maestros("Kardan","Muñoz", "9987736453", "@kardanMuñoz"));
		lista.add(new Maestros("Kennybyaa","A", "8765463746", "@kennybyaa"));
	}//constructor
	public List<Maestros>getTeacher(){
		return lista;
	}//getTeacher
	public Maestros getTeacher(Long id) {
		Maestros tmpMa=null;
		for(Maestros ma:lista) {
			if(ma.getId()==id) {
				tmpMa= ma;
				break;
			}//if
		}//foreach
		return tmpMa;
	}//get
	public Maestros deleteTeacher(Long id) {
		Maestros tmpMa=null;
		for(Maestros ma:lista) {
			if(ma.getId()==id){
			tmpMa=ma;
			lista.remove(ma);
			break;
		}//if	
	}//foreach
		return tmpMa;
}//deleteTeacher
	public Maestros addTeacher(Maestros maestros) {
		lista.add(maestros);
		return maestros;
	}//addTeacher
	public Maestros updateTeacher(Long id, String nombre, String apellido, String telefono, String redSocial) {
		Maestros tmpTeacher=null;
		for(Maestros ma:lista) {
			if(ma.getId()==id) {
			if(nombre!=null)ma.setNombre(nombre);
			if(apellido!=null)ma.setApellido(apellido);
			if(telefono!=null)ma.setTelefono(telefono);
			if(redSocial!=null)ma.setRedSocial(redSocial);
			tmpTeacher=ma;
			break;
			}//if
	}//foreach
	return tmpTeacher;
   }
}