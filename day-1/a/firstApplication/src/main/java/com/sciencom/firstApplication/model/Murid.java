package com.sciencom.firstApplication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Murid {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  id;
	private String namaDepan;
	private String nameBelakang;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "murid_kursus",joinColumns = @JoinColumn(name="murid_id"),inverseJoinColumns = @JoinColumn(name="kursus_id"))
	//@JoinTable(name = "author_books", joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
	private Set<Kursus> kursuss123 =new HashSet<>();
	
	
	public Murid(String namaDepan, String nameBelakang, Set<Kursus> kursuss) {
		super();
		this.namaDepan = namaDepan;
		this.nameBelakang = nameBelakang;
		this.kursuss123 = kursuss;
	}
	
	public Murid(String namaDepan, String nameBelakang) {
		super();
		this.namaDepan = namaDepan;
		this.nameBelakang = nameBelakang;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamaDepan() {
		return namaDepan;
	}
	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}
	public String getNameBelakang() {
		return nameBelakang;
	}
	public void setNameBelakang(String nameBelakang) {
		this.nameBelakang = nameBelakang;
	}
	public Set<Kursus> getKursuss() {
		return kursuss123;
	}
	public void setKursuss(Set<Kursus> kursuss) {
		this.kursuss123 = kursuss;
	}
	
	
	
}
