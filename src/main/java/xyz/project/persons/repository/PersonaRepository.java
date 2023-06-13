package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.project.persons.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
