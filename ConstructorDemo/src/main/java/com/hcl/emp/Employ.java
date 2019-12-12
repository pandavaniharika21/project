package com.hcl.emp;

public class Employ {
	int emono;
	String name;
	double basic;
	
	
	public Employ(int emono, String name, double basic) {
		super();
		this.emono = emono;
		this.name = name;
		this.basic = basic;
	}


	@Override
	public String toString() {
		return "Employ [emono=" + emono + ", name=" + name + ", basic=" + basic + "]";
	}


	
	
	

}
