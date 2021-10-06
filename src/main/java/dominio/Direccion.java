package dominio;

import javax.persistence.*;

@Entity
@Table
public class Direccion {
	
	@Id
	@Column
	private String id_Direccion;
	@Column
	private String calle;
	@Column
	private Integer numero;
	@Column
	private Integer piso;
	@Column
	private Integer dto;

	
	
	public Direccion () {
		
	}
	
	public Direccion(String id_Direccion, String calle, Integer numero, Integer piso, Integer dto) {
		super();
		this.id_Direccion = id_Direccion;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dto = dto;
	}
	
	
	public Direccion(String calle, Integer numero, Integer piso, Integer dto) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dto = dto;
	}

	public String getId_Direccion() {
		return id_Direccion;
	}
	public void setId_Direccion(String id_Direccion) {
		this.id_Direccion = id_Direccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getDto() {
		return dto;
	}

	public void setDto(Integer dto) {
		this.dto = dto;
	}

}
