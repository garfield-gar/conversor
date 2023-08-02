package br.com.conversor.model.alura;

public class Moeda {

	private double valor;

	// constructors
	public Moeda() {

	}

	public double converter(String tipoConversao) {

		tipoConversao = tipoConversao.trim().toLowerCase();

		// conversão de reais para outras moedas
		if (tipoConversao.equals("de reais a dolares")) {
			return this.valor / 4.72;
		}

		if (tipoConversao.equals("de reais a euros")) {
			return this.valor / 0.90;
		}

		if (tipoConversao.equals("de reais para libras esterlinas")) {
			return this.valor / 0.16;
		}

		if (tipoConversao.equals("de reais para peso argentino")) {
			return this.valor / 57.87;
		}

		if (tipoConversao.equals("de reais para peso chileno")) {
			return this.valor / 175.02;
		}

		// Conversão de outras moedas para reais
		if (tipoConversao.equals("de dolares a reais")) {
			return this.valor * 4.37;
		}

		if (tipoConversao.equals("de euros a reais")) {
			return this.valor * 0.90;
		}

		if (tipoConversao.equals("de libras esterlinas a reais")) {
			return this.valor * 0.16;
		}

		if (tipoConversao.equals("de peso argentino a reais")) {
			return this.valor * 57.87;
		}

		if (tipoConversao.equals("de peso chileno a reais")) {
			return this.valor * 175.02;
		}

		// If the conversion is not recognized, return an error value (e.g., -1)
		return -1;
	}
	
	public double converterTemperatura(String tipoConversao) {

		tipoConversao = tipoConversao.trim().toLowerCase();

		// conversão de reais para outras moedas
		if (tipoConversao.equals("Celsius em Fahrenheit")) {
			return this.valor * 1.8 + 32;
		}

		if (tipoConversao.equals("Celsius em kelvin")) {
			return this.valor + 273.15;
		}

		

		
		// Conversão reversa da temperatura
		if (tipoConversao.equals("Fahrenheit em Celsius")) {
			return (this.valor - 32)/ 1.8;
		}

		if (tipoConversao.equals("Kelvin em celsius")) {
			return this.valor - 273.15;
		}

		

		// If the conversion is not recognized, return an error value (e.g., -1)
		return -1;
	}
	
	public double getValor() {
		return valor;
	}

	

	public void setValor(double valor) {
		this.valor = valor;

	}

}
