package com.test4;

public class Manager {
	int managerId;
	String managerName;

	public void setManagerData(int managerId, String managerName) {
		this.managerId = managerId;
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}

}
