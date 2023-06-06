package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.project.persons.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{

}
