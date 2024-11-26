package com.test4;


public class MusicPlayer implements AdvancedmediaPlayer {
	    private String songTitle;

	   
	    public MusicPlayer(String songTitle) {
	    	if(songTitle.isEmpty()) {
	    		System.err.println("Title is not be empty string.");
	    		System.exit(0);
	    	}
	    	else {
	        this.songTitle = songTitle;
	    	}
	    }

	@Override
	public void play() {
		System.out.println("Music Player is Playing: "+songTitle);
		
	}

	@Override
	public void stop() {
		System.out.println("Music Player is Stoping: "+songTitle);
		
	}

	@Override
	public void pause() {
		System.out.println("Music Player is Pausing: "+songTitle);
		
	}


}
