package model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String secondName;
	private String email;
	private String addres;
	private String gender;
	
	public Person() {
		
	}

	public Person(Long id, String name, String secondName, String email, String addres, String gender) {
		this.id = id;
		this.name = name;
		this.secondName = secondName;
		this.email = email;
		this.addres = addres;
		this.gender = gender;
	}

	public Person(String name, String secondName, String email, String addres, String gender) {
		this.name = name;
		this.secondName = secondName;
		this.email = email;
		this.addres = addres;
		this.gender = gender;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}
}
