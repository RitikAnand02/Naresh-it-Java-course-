package com.test1;

public class Player {

	int playerId;
	String playerName;

	public void show() {
		System.out.println(playerId);
		System.out.println(playerName);
	}

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.show();
	}

}
