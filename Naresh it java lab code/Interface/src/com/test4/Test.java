package com.test4;

public class Test {

	public static void main(String[] args) {
		MusicPlayer m1 = new MusicPlayer("Life");
		m1.play();
		m1.pause();
		m1.stop();
		System.out.println();
		
		VideoPlayer v1 = new VideoPlayer("Nature");
		v1.play();
		v1.pause();
		v1.stop();
		

	}

}
