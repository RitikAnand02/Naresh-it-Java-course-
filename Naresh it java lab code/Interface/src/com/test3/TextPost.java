package com.test3;

public class TextPost implements Post{
    private String textContent;
	private int likes;

	public TextPost(String textContent) {
		super();
		if (textContent == null || textContent.trim().isEmpty()) {
			System.err.println("Error: Text content cannot be empty.");
			System.exit(0);
		}
		this.textContent = textContent;
		this.likes = 0;
	}

	@Override
	public void publish() {
		System.out.println("Post Published: " + textContent);		
	}

	@Override
	public void like() {
		likes++;
        System.out.println("Post Liked! Total likes: " + likes);		
	}
	
	  public int getTextContent() {
	        return likes;
	    }
    public int getLikes() {
	        return likes;
	    }

}
