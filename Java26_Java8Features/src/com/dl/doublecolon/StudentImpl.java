package com.dl.doublecolon;

public class StudentImpl {

	//properties
	private int id;
	private String name;
	
	//constructor using args
	public StudentImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//toString
	@Override
	public String toString() {
		return "StudentImpl [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
