package com.deloitte;

public class Computer {
	String Brandname;
	CPU cpu;
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	
	//no getter and setter for cpu because we are using injection at constructor level

}
