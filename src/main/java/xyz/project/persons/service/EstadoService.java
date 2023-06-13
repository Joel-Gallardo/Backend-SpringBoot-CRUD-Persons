package xyz.project.persons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.project.persons.model.Estado;
import xyz.project.persons.repository.EstadoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService{
	
	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAllByCountryId (Long id){
		List<Estado> estadosRespuesta = new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		for(int i=0; i<estados.size(); i++) {
			if( estados.get(i).getPais().getId() == id ) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}

}
