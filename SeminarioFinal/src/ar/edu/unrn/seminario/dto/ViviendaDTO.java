package ar.edu.unrn.seminario.dto;

import java.util.Date;

public class ViviendaDTO {

	private Due�oViviendaDTO due�o;
	private DomicilioDTO domicilio;
	private Date fechaRegistro;

	public ViviendaDTO(Due�oViviendaDTO due�o, DomicilioDTO domicilio, Date fechaRegistro) {
		this.due�o = due�o;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}
}
