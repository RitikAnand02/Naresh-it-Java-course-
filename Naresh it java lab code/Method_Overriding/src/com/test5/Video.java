package com.test5;

 class Video extends CourseContent {
	 private int duration;

	public Video(String title, int duration) {
		super(title);
		if(duration<0 ) {
			System.err.println("Invalid duration for video");
			System.exit(0);
		}
		else {
			this.duration = duration;
		}
		
	}

	public int getDuration() {
		return duration;
	}
}
