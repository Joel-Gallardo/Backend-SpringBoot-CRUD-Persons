package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.project.persons.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
