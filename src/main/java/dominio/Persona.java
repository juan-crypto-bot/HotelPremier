package dominio;

import java.util.Date;

import enumClasses.TipoDocumento;

public class Persona {

	private String apellido;

	private String nombre;

	private TipoDocumento tipoDocumento;

	private Integer numeroDocumento;

	private Direccion direccion;

	private Integer cuit;

	private Date nacimiento;

	private String correoElectronico;

	private String ocupacion;

	private Integer telefono;
	
	public Persona(String apellido, String nombre, String tipoDocumento, Integer numeroDocumento,
			Direccion direccion, Integer cuit, Date nacimiento, String correoElectronico, String ocupacion,
			Integer telefono) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		
		if(tipoDocumento == "DNI" ) this.tipoDocumento = TipoDocumento.DNI;
		if(tipoDocumento == "LC" ) this.tipoDocumento = TipoDocumento.LC;
		if(tipoDocumento == "LE" ) this.tipoDocumento = TipoDocumento.LE;
		if(tipoDocumento == "PASAPORTE" ) this.tipoDocumento = TipoDocumento.PASAPORTE;
		if(tipoDocumento == "OTRO" ) this.tipoDocumento = TipoDocumento.OTRO;
			
		this.numeroDocumento = numeroDocumento;
		this.direccion = direccion;
		this.cuit = cuit;
		this.nacimiento = nacimiento;
		this.correoElectronico = correoElectronico;
		this.ocupacion = ocupacion;
		this.telefono = telefono;
	}

}
