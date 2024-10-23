package com.test15;

class Science extends Student {
	protected int physics;
	protected int chemistry;

	public Science(int studentId, String studentName, String studentAddress, int physics, int chemistry) {
		super(studentId, studentName, studentAddress);
		this.physics = physics;
		this.chemistry = chemistry;
	}
}