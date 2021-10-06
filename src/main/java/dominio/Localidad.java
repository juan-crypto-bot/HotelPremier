package dominio;

import javax.persistence.*;

@Entity 
@Table 

public class Localidad {

	@Column
	private String nombre;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private Integer idLocalidad;
	@Column
	private Integer codPostal;
	
	
	public Localidad() {
		
	}
	
	public Localidad(String nombre, Integer idLocalidad, Integer codPostal) {
		super();
		this.nombre = nombre;
		this.idLocalidad = idLocalidad;
		this.codPostal = codPostal;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public Integer getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(Integer codPostal) {
		this.codPostal = codPostal;
	}
	
	

}
