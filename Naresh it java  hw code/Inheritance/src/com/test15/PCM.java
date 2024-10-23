package com.test15;

class PCM extends Science 
{
	protected int math;

	public PCM(int studentId, String studentName, String studentAddress, int physics, int chemistry, int math) {
		super(studentId, studentName, studentAddress, physics, chemistry);
		this.math = math;
	}
	
	public void calculateMarks()
	{
		int total = this.physics + this.chemistry + this.math;
		System.out.println("Total Marks is :"+total);
	}
	
	

	@Override
	public String toString() 
	{
		return "PCM [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", physics=" + physics + ", chemistry=" + chemistry + ", math=" + math + "]";
	}

}
