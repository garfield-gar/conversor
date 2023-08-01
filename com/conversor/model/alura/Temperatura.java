package br.com.conversor.model.alura;

public  class Temperatura {
	private double temperatura;
	
	public Temperatura(double temperatura) {
		this.temperatura=temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	public Object temp (String temp) {
		if(temp.equalsIgnoreCase("Graus Celsius para Graus Fahrenheit ")) {
			return this.temperatura * 1.8 + 32;
		}
		
		if(temp.equalsIgnoreCase("Graus Celsius para escala Kelvin")) {
			return this.temperatura + 273.15;
		}
		
		if(temp.equalsIgnoreCase(" Graus Fahrenheit para Graus Celsius")) {
			return this.temperatura - 32/1.8;
		}
		
		if(temp.equalsIgnoreCase("escala Kelvin para Graus Celsius")) {
			return this.temperatura - 273.15;
		}
		
		return null;
	
	}
	
	
}
