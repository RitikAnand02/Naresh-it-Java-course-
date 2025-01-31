package com.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo2 
{
	public static void main(String args[])
	{
		//Get the name of the Player in upper-case from Player Object
		Set<Player> playerList = createPlayerList();
		
		List<String> collect = playerList.stream().map(player -> player.name().toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
			
	}	
	
	public static Set<Player> createPlayerList()
	{
		Set<Player> player = new HashSet<>();
		player.add(new Player(18, "Virat"));
		player.add(new Player(45, "Rohit"));
		player.add(new Player(7, "Dhoni"));
		player.add(new Player(18, "Virat"));
		player.add(new Player(90, "Bumrah"));
		player.add(new Player(67, "Hardik"));
		
		return player;	
	}
}
 
record Player1(Integer id, String name) 
{
	
}
