package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_especialidad")
public class Especialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column (name= "id_especialidad")
	public Integer idEspecialidad ;
	
	
	@Column (name="titulo")
	public String titulo;
	
	@Override
	public String toString() {
		return titulo;
	}
}
