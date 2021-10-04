package dominio;

public class Direccion {

	private String calle;
	private Integer numero;
	private Integer piso;
	private Integer dto;

	public Direccion(String calle, Integer num, Integer piso, Integer dto) {

		this.calle = calle;
		this.numero = num;
		this.piso = piso;
		this.dto = dto;

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
