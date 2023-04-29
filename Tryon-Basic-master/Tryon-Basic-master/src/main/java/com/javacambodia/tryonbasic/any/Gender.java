package com.javacambodia.tryonbasic.any;

public class Gender {
	private int id;
	private String name;
	private String nameKh;
	
	public Gender (int id, String name, String nameKh) {
		this.id = id;
		this.name = name;
		this.nameKh = nameKh;
	}
	
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
	public String getNameKh() {
		return nameKh;
	}
	public void setNameKh(String nameKh) {
		this.nameKh = nameKh;
	}
}
