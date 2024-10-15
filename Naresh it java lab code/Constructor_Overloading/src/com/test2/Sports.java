package com.test2;

public class Sports {
	private String sportName;
	private int teamSize;
	private String sportType;
	
	public Sports() {
		
	}
	
	    public Sports(String sportName, int teamSize) {
		super();
		if(teamSize<=0)
		{
			System.err.println("Team size must be positive.");
			System.exit(0);
		}
		if(sportName==null || sportName.length()==0)
		{
			System.err.println("Sport Name Cannot be Empty");
			System.exit(0);
		}

		this.teamSize = teamSize;			
		this.sportName = sportName;
		
	}
	
	public Sports(String sportName, int teamSize, String sportType) {
		super();
		if(teamSize<=0)
		{
			System.err.println("Team size must be positive.");
			System.exit(0);
		}
		if(sportName==null || sportName.length()==0)
		{
			System.err.println("Sport Name Cannot be Empty");
			System.exit(0);
		}
		
		if(sportType==null || sportType.length()==0)
		{
			System.err.println("Sport Type Cannot be Empty");
			System.exit(0);
		}
		this.sportName = sportName;
		this.teamSize = teamSize;
		this.sportType = sportType;
	}
	
	public void displayInfo() {
		
			System.out.println("Team Size: "+teamSize);
			System.out.println("Sport Name: "+sportName);
			System.out.println("Sport Type: "+sportType);
		}
		
	}
	
	


