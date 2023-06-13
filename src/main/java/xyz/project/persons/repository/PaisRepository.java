package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.project.persons.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
