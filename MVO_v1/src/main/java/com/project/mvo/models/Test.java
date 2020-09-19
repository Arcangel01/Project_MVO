package com.project.mvo.models;

public class Test {

	private int id;

	private String nombre;

	private String apellido;

	private int edad;

	private String Ocupacion;

	public Test() {
	}

	public Test(int id, String nombre, String apellido, int edad, String ocupacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		Ocupacion = ocupacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return Ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}

}
