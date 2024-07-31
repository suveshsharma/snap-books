package com.files;

public class Employee {

	String name,uid,upass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", uid=" + uid + ", upass=" + upass + "]";
	}
}
