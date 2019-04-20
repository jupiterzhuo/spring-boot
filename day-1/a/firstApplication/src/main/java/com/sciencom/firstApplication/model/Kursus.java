package com.sciencom.firstApplication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Kursus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String judul;
	@ManyToMany(mappedBy = "kursuss123")
	private Set<Murid> murids = new HashSet<>();
	public Kursus(String judul, Set<Murid> murids) {
		super();
		this.judul = judul;
		this.murids = murids;
	}
	public Kursus(String judul) {
		super();
		this.judul = judul;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public Set<Murid> getMurids() {
		return murids;
	}
	public void setMurids(Set<Murid> murids) {
		this.murids = murids;
	}
	
	
	
	
}
