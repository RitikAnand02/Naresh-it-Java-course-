package com.test2;

public class Batter {
	public String name;
	public int runs;
	public int matches;
	public float batting_avg;
	
	public Batter(String name, int runs, int matches)
	{
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	
	public void computeBattingAverage() {
		if(this.name==null)
		{
			System.out.println("Name cannot be empty");
			System.exit(0);
		}
		else if(this.runs<0 || this.matches<0)
		{
			System.err.println("error 1");
			System.exit(0);
		}
		else if(this.runs<0) {
			System.out.println("Runs and matches must be non-negative");
			System.exit(0);
		}
		else if(this.runs>0 && this.matches==0 )
		{
			System.err.println("error 2");
			System.exit(0);
		}
		else {
			this.batting_avg = this.runs/this.matches;
			System.out.println("Batter Name: "+name);
			System.out.println("Batting Average: "+batting_avg);
			
		}
		
		
	}
	public void getStatistics() {
		System.out.println("Batter Name: "+name);
		System.out.println("No of Runs: "+runs);
		System.out.println("No of Matches: "+matches);
	}

}
