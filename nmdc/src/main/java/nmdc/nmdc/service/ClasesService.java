package nmdc.nmdc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.nmdc.model.Clases;
@Service
public class ClasesService {
private final ArrayList<Clases>lista=new ArrayList<Clases>();
	@Autowired
	//constructor
	public ClasesService() {
		lista.add(new Clases("Hip-Hop","15 años en adelante" ,"lunes de 18:00 a 19:30 hrs"));
		lista.add(new Clases("Hip-Hop","15 años en adelante" ,"Sábado y domingo de 11:00 a 12:15 hrs."));
		lista.add(new Clases("Heels", "15 años en adelante" ,"Jueves de 19:30 a 21:00 hrs."));
		lista.add(new Clases("Heels","15 años en adelante" ,"Sábado de 12:15 a 13:30 hrs."));
		lista.add(new Clases("Jazz","15 años en adelante" , "Jueves de 18:00 a 19:00 hrs."));
	}
	//getUser
	public List<Clases>getClas(){
		return lista;
	}
	public Clases getClas(Long id) {
		Clases tmpCl=null;
		for(Clases Cl:lista) {
			if(Cl.getId()==id) {
				tmpCl=Cl;
				break;
			}
		}
		return tmpCl;
	}
	public Clases deleteClas(Long id) {
		Clases tmpCl=null;
		for(Clases Cl:lista) {
			if(Cl.getId()==id) {
				tmpCl=Cl;
				lista.remove(Cl);
				break;
			}
		}
		return tmpCl;
	}
	public Clases addClas(Clases clases) {
		lista.add(clases);
		return clases;
	}
	public Clases updateClas(Long id, String nombreClase, String edadAdmision, String horario) {
		Clases tmpCl=null;
		for(Clases cl:lista) {
			if(cl.getId()==id) {
				if(nombreClase!=null)cl.setNombreClase(nombreClase);
				if(edadAdmision!=null)cl.setEdadAdmision(edadAdmision);
				if(horario!=null)cl.setHorario(horario);
				tmpCl=cl;
				break;
			}//if
			
		}//foreach
		return tmpCl;
	}
	}

