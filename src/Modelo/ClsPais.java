/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camilo
 */
public class ClsPais {
	private String id;
    private String nombre;
    private String continente;
    private String idioma;
    private String moneda;
    private String bandera;
    private String capital;
    private int poblacion;
    
    public ClsPais() {
    }

	public ClsPais(String id, String nombre, String continente, String idioma, String moneda, String bandera,
			String capital, int poblacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.continente = continente;
		this.idioma = idioma;
		this.moneda = moneda;
		this.bandera = bandera;
		this.capital = capital;
		this.poblacion = poblacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getBandera() {
		return bandera;
	}
	public void setBandera(String bandera) {
		this.bandera = bandera;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getId() {
		return id;
	}
	
    public String getFullInfo() {
        return nombre + " capital: " + capital + ", con una poblacion de: " + poblacion + " habitantes" ;
    }
}
