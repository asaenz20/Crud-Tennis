package com.developer.crud.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cliente")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cedula")
	private long id;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name = "nombre")
	private String name;
	
	@NotBlank(message = "Address is mandatory")
	@Column(name = "direccion")
	private String address;
	
	@Column(name = "telefono")
	private long phone;


	public Client() {}
	
	public Client(/*Long id,*/ String name, String address, Long phone) {
		super();
		//this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/**
	 * Getters - Setters
	 */
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
