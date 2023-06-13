package xyz.project.persons.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import xyz.project.persons.model.Persona;
import xyz.project.persons.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Persona> findAll(Pageable pageable) {
		return personaRepository.findAll(pageable);
	}


	public <S extends Persona> S save(S entity) {
		return personaRepository.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		return personaRepository.findById(id);
	}

	public void deleteById(Long id) {
		personaRepository.deleteById(id);
	}

	public void delete(Persona entity) {
		personaRepository.delete(entity);
	}

}