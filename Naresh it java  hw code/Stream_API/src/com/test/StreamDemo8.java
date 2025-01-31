package com.test;

//Program on map(Function<T,R> mapped)

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo8
{ 
	public static void main(String args[])
	{
		//Get the name of the Player in upper-case from Player Object
		  
		 List<Player> playerList = createPlayerList();
		 
		Set<String> playerName = playerList.stream().map(player -> player.name().toUpperCase()).collect(Collectors.toSet());
		
		System.out.println(playerName);
		
		
		
			
	}	
	
	public static List<Player> createPlayerList()
	{
		List<Player> al = new ArrayList<>();
		al.add(new Player(18, "Virat"));
		al.add(new Player(45, "Rohit"));
		al.add(new Player(7, "Dhoni"));
		al.add(new Player(18, "Virat"));
		al.add(new Player(90, "Bumrah"));
		al.add(new Player(67, "Hardik"));
		
		return al;
	}
}


record Player(Integer id, String name) 
{
	
}
