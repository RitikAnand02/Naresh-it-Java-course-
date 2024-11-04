package com.test1;

	public class Engine 
	{
		private String model;
		
		public Engine(String model) {
			super();

	        this.model = model;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		@Override
		public String toString() {
			return "Engine [model=" + model + "]";
		}

	}


