package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_dentista")
public class Dentista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	
	
	@Column (name= "id_dentista")
	public Integer idDentista ;
	
	@Column (name="cop")
	public String cop;
	
	@Column (name= "nombre_completo")
	public String nombreCompleto ;
	
	@Column (name= "fecha_inicio_contrato")
	public LocalDate fechaInicioContrato ;
	
	@Column (name= "turno")
	public String turno ;
	
	@Column (name= "correo")
	public String correo ;
	
	@ManyToOne
	@JoinColumn (name= "id_especialidad")
	public Especialidad especialidad; 
	
	@Override
	public String toString() {
		return nombreCompleto;
	}
	
}
