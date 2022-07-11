package com.d.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="citasMedicas")
public class citasMedicas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="paciente_id")
	private paciente paciente;
	
	private Integer hora;
	private String areaMedica;
	public citasMedicas() {
		super();
	}
	public citasMedicas(Long id, com.d.models.paciente paciente, Integer hora, String areaMedica) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.hora = hora;
		this.areaMedica = areaMedica;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(paciente paciente) {
		this.paciente = paciente;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public String getAreaMedica() {
		return areaMedica;
	}
	public void setAreaMedica(String areaMedica) {
		this.areaMedica = areaMedica;
	}
	

}
