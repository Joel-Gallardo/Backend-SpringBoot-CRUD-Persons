package xyz.project.persons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.project.persons.model.Pais;
import xyz.project.persons.repository.PaisRepository;

import java.util.List;

@Service
public class PaisService{

	@Autowired
	private PaisRepository paisRepository;

	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

}
