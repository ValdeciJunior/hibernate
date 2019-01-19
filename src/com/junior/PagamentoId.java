package com.junior;
// Generated 18/jan/2019 22:29:22 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PagamentoId generated by hbm2java
 */
public class PagamentoId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private long cdcurso;
	private Date data;

	public PagamentoId() {
	}

	public PagamentoId(long id, long cdcurso) {
		this.id = id;
		this.cdcurso = cdcurso;
	}

	public PagamentoId(long id, long cdcurso, Date data) {
		this.id = id;
		this.cdcurso = cdcurso;
		this.data = data;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCdcurso() {
		return this.cdcurso;
	}

	public void setCdcurso(long cdcurso) {
		this.cdcurso = cdcurso;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PagamentoId [id=" + id + ", cdcurso=" + cdcurso + ", data=" + data + "]";
	}
	
	

}
