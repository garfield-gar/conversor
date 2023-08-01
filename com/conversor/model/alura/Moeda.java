package br.com.conversor.model.alura;
public class Moeda {

    private double valor;
    
    App app = new App ();
    
    
   

    // constructors
    public Moeda() {

    }
    
    public Object Converter(String converter) {
    	valor = Double.parseDouble(converter);    	
    	
        if (converter.equalsIgnoreCase("de reais a dolares")) {
            return valor / 4.37;
        }

        if (converter.equalsIgnoreCase("de reais a euros")) {
            return valor / 0.90;
        }

        if (converter.equalsIgnoreCase("de reais para Libras esterlinas")) {
            return valor / 0.16;
        }

        if (converter.equalsIgnoreCase("de reais para peso argentino")) {
            return valor / 57.87;
        }

        if (converter.equalsIgnoreCase("de reais para peso chileno")) {
            return valor / 175.02;
        }

        // conversions in reverse
        if (converter.equalsIgnoreCase("de dolares a reais")) {
              	
        	return  this.valor = (valor * 4.37);
        }

        if (converter.equalsIgnoreCase("de euros a reais")) {
            return valor * 0.90;
        }

        if (converter.equalsIgnoreCase("de Libras esterlinas a reais")) {
            return valor * 0.16;
        }

        if (converter.equalsIgnoreCase("de peso argentino a reais")) {
            return valor * 57.87;
        }

        if (converter.equalsIgnoreCase("de peso chileno a reais")) {
            return valor * 175.02;
        }

        return this.getValor();    }
    
    
    public void setValor(String resp) {
        double dinheiro = Double.parseDouble(resp);
        this.valor = dinheiro;
    }
    
    public double getValor() {
    	String resp = String.valueOf(valor);
        return valor;
    }

    public String toString() {
        return "O valor da conversão é de " + this.getValor();
    }

	public void setValor(double valor) {
		this.valor = valor;
	}
}
