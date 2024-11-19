package com.test5;

public class MainCourse {

	public static void main(String[] args) {
		  Video video = new Video("Java Tutorial", 45);
	        Article article = new Article("OOP Concepts", "John Doe");
	        Quiz quiz = new Quiz("Java Basics Quiz", 10);

	        CourseManager manager = new CourseManager();

	   
	        manager.processContent(video);
	        System.out.println();
	        manager.processContent(article);
	        System.out.println();
	        manager.processContent(quiz);
	        System.out.println();

	      
	        manager.processMultipleContents(video, article, quiz);
	}

}
