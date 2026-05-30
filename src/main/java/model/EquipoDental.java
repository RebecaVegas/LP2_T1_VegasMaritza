package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "tbl_equipo_dental")
public class EquipoDental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	
	
	@Column (name= "nro_equipo")
	public Integer nroEquipo ;
	
	@Column (name="nombre")
	public String nombre;
	
	@Column (name= "costo")
	public Double costo ;
	
	@Column (name= "fecha_adquisicion")
	public LocalDate fechaAdquisicion ;
	
	@Column (name= "estado")
	public String estado ;
	
	@ManyToOne
	@JoinColumn (name= "id_dentista")
	public Dentista dentista ;
	
	public String getEstadoDescripcion() {
		switch (estado) {
		case "N":
			return "Nuevo";
		case "R":
			return "Reparado";
		case "S":
			return "S";
		case "A":
			return "A";
		default:
			return "Desconocido";
		}
	}
}
