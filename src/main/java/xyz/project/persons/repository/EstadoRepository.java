package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.project.persons.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
	
}
