package br.com.conversor.model.alura;
import javax.swing.JOptionPane;

import br.com.conversor.model.alura.Moeda;

public  class  App  {

	public static void main(String[] args)  {
		
		Moeda moeda = new Moeda();
		String resp;


		// Opções para o dropdown
		String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };

		// Mostra o dropdown usando o JOptionPane
		String selecao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0] // Opção selecionada por padrão
				);

		if(selecao != null) {
			int resposta = JOptionPane.showOptionDialog(null,
					" ", "Conversor de Moedas",JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE,null, new String[] {
							"Dolares", "Euro", "LIBRAS ESTARLINAS", "peso Argentino", "peso Chileno"
			},"default");

			// tratamento da resposta do botão clicado
			switch(resposta) {

			case 0:
				resp =JOptionPane.showInputDialog(null,"Digite um valor:");
				resp.trim();
				moeda.conver(resp);


				break;
			case 1:
				resp = JOptionPane.showInputDialog(null,"Digite um valor:");
				resp.trim();
				moeda.conver(resp);
				break;
			case 2:
				resp = JOptionPane.showInputDialog(null,"Digite um valor:");
				resp.trim();
				moeda.conver(resp);
				break;
			case 3:
				resp = JOptionPane.showInputDialog(null,"Digite um valor:");
				resp.trim();
				moeda.conver(resp);
				break;
			case 4:
				resp = JOptionPane.showInputDialog(null,"Digite um valor:");
				resp.trim();
				moeda.conver(resp);
				break;


			}
		}else {
			int resposta = JOptionPane.showOptionDialog(null,
					" ", "Conversor de Moedas",JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE,null, new String[] {
							"Celsius", "Fahrenheit", "Kelvin"
			},"default");

			// tratamento da resposta do botão clicado
			switch(resposta) {

			case 0:
				resp = JOptionPane.showInputDialog(null,"Digite um valor em Celsius:");
				resp.trim();

				break;
			case 1:
				resp = JOptionPane.showInputDialog(null,"Digite um valor em Celsius:");
				resp.trim();
				break;
			case 2:
				resp = JOptionPane.showInputDialog(null,"Digite um valor em Celsius:");
				resp.trim();
				break;

			}
		}

		JOptionPane.showMessageDialog(null,
				moeda.toString(),
				"Message",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}
