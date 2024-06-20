package model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_PERSON")
public class Person {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private Date ngaySinh;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="spouse_id")
	private Person spouse;
	public Person() {
		
	}
	public Person(String name, Date ngaySinh, Person spouse) {
		
		
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.spouse = spouse;
	}
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
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Person getSpouse() {
		return spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	
	
}
