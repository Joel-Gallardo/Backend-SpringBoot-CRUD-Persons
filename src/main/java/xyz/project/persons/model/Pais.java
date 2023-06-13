package xyz.project.persons.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "pais")
public class Pais implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	
	
	/* se utilizo instalo en el pomp la dependencia lombok para que mediante la anotacion @Data en la firma de la clase
	 se generaran de manera automatica y invisible los getters y setters


	public Pais() {
	}

	public Pais(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	*/

}
