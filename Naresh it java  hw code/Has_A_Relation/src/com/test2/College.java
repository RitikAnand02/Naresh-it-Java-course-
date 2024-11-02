package com.test2;

public class College 
{
	private String collegeName;
	private String collegeLocation;

	public College(String collegeName, String collegeLocation) 
	{
		super();
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}

	@Override
	public String toString() 
	{
		return "College [collegeName=" + collegeName + ", collegeLocation=" + collegeLocation + "]";
	}
}
