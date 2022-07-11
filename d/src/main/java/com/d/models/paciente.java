package com.d.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="paciente")
public class paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer rut;
	private String nombre;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@OneToMany(mappedBy ="paciente",cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
	private List<citasMedicas> citasMedicas;

	public paciente() {
		super();
	}

	public paciente(Long id, Integer rut, String nombre, Date fechaNacimiento,
			List<com.d.models.citasMedicas> citasMedicas) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.citasMedicas = citasMedicas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<citasMedicas> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<citasMedicas> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}
	

}

