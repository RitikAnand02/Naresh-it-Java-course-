package com.test5;

 class Mammal extends Animal {
	 private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	 @Override
	public void getDisplay() {
		 super.getDisplay();
		System.out.println("Animal Breed: "+isHasFur());
	}

}
