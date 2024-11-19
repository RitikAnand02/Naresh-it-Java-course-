package com.test5;

public class CourseManager {
	public void processContent( CourseContent content) {
		 if (content instanceof Video) {
	            Video video = (Video) content;
	            System.out.println("Processing Video: " + video.getTitle() + " with duration: " + video.getDuration() + " minutes");
	        } else if (content instanceof Article) {
	            Article article = (Article) content;
	            System.out.println("Processing Article: " + article.getTitle() + " by author: " + article.getAuthor());
	        } else if (content instanceof Quiz) {
	            Quiz quiz = (Quiz) content;
	            System.out.println("Processing Quiz: " + quiz.getTitle() + " with number of questions: " + quiz.getNumberOfQuestions());
	        } else {
	            System.out.println("Unknown content type");
	        }
		
	}
   
	
    public void processMultipleContents( CourseContent... contents) {
    	 for (CourseContent content : contents) {
             processContent(content);
         }
		
	}
}
