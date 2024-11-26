package com.test4;

public class VideoPlayer implements AdvancedmediaPlayer {
	private String videoTitle;

    public VideoPlayer(String videoTitle) {
    	if(videoTitle.isEmpty()) {
    		System.err.println("Title is not be empty string.");
    		System.exit(0);
    	}
    	else {
        this.videoTitle = videoTitle;
    	}
    }

	@Override
	public void play() {
		System.out.println("Video Player is Playing: "+videoTitle);

	}

	@Override
	public void stop() {
		System.out.println("Video Player is Stoping: "+videoTitle);
	}

	@Override
	public void pause() {
		System.out.println("Video Player is Pausing: "+videoTitle);
	}

}
