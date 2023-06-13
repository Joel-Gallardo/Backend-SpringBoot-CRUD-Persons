package xyz.project.persons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.project.persons.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
