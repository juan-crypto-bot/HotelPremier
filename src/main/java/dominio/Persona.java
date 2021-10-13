package dominio;

import java.util.Date;

import javax.persistence.*;

import enumClasses.PosicionFrenteIVA;
import enumClasses.TipoDocumento;

@Entity
@Table
public class Persona {

	@Id
	private Integer Id;
	
	private String apellido;
	private String nombre;
	private TipoDocumento tipoDocumento;
	private Integer numeroDocumento;
//	private Direccion direccion;
	private Integer cuit;
	private Date nacimiento;
	private String nacionalidad;
	private String correoElectronico;
	private String ocupacion;
	private Integer telefono;
	private PosicionFrenteIVA posFrenteIVA;

	public Persona() {

	}

	public Persona(String apellido, String nombre, String tipoDocumento, Integer numeroDocumento, Direccion direccion,
			Integer cuit, Date nacimiento, String nacionalidad, String correoElectronico, String ocupacion,
			Integer telefono, String posFrenteIVA) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		if (tipoDocumento == "DNI")
			this.tipoDocumento = TipoDocumento.DNI;
		if (tipoDocumento == "LC")
			this.tipoDocumento = TipoDocumento.LC;
		if (tipoDocumento == "LE")
			this.tipoDocumento = TipoDocumento.LE;
		if (tipoDocumento == "PASAPORTE")
			this.tipoDocumento = TipoDocumento.PASAPORTE;
		if (tipoDocumento == "OTRO")
			this.tipoDocumento = TipoDocumento.OTRO;
		this.numeroDocumento = numeroDocumento;
		//this.direccion = direccion;
		this.cuit = cuit;
		this.nacimiento = nacimiento;
		this.nacionalidad = nacionalidad;
		this.correoElectronico = correoElectronico;
		this.ocupacion = ocupacion;
		this.telefono = telefono;

		if (posFrenteIVA == "Consumidor final")
			this.posFrenteIVA = PosicionFrenteIVA.ConsumidorFinal;
		if (posFrenteIVA == "IVA Responsable Inscripto")
			this.posFrenteIVA = PosicionFrenteIVA.IVAresponsableInscripto;
		if (posFrenteIVA == "IVA Sujeto Exento")
			this.posFrenteIVA = PosicionFrenteIVA.IVAsujetoExento;
		if (posFrenteIVA == "Responsable Monotributo")
			this.posFrenteIVA = PosicionFrenteIVA.ResponsableMonotributo;

	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;

	}

	public void setTipoDocumento(String tipoDocumento) {

		if (tipoDocumento == "DNI")
			this.tipoDocumento = TipoDocumento.DNI;
		if (tipoDocumento == "LC")
			this.tipoDocumento = TipoDocumento.LC;
		if (tipoDocumento == "LE")
			this.tipoDocumento = TipoDocumento.LE;
		if (tipoDocumento == "PASAPORTE")
			this.tipoDocumento = TipoDocumento.PASAPORTE;
		if (tipoDocumento == "OTRO")
			this.tipoDocumento = TipoDocumento.OTRO;
	}

	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	

	public PosicionFrenteIVA getPosFrenteIVA() {
		return posFrenteIVA;
	}

	public void setPosFrenteIVA(String posFrenteIVA) {
		
		if (posFrenteIVA == "Consumidor final")
			this.posFrenteIVA = PosicionFrenteIVA.ConsumidorFinal;
		if (posFrenteIVA == "IVA Responsable Inscripto")
			this.posFrenteIVA = PosicionFrenteIVA.IVAresponsableInscripto;
		if (posFrenteIVA == "IVA Sujeto Exento")
			this.posFrenteIVA = PosicionFrenteIVA.IVAsujetoExento;
		if (posFrenteIVA == "Responsable Monotributo")
			this.posFrenteIVA = PosicionFrenteIVA.ResponsableMonotributo;
	}
/*
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
*/
	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	
}
