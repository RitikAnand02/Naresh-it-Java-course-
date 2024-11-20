package com.test2;

 class MyBook extends Book{

	@Override
	public void setTitle(String title) {
		System.out.println("The title of my book is: "+title);
		
	}
	
	@Override
	public String getTitle() {
		return title;
	}

}
