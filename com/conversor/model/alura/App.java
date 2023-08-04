package br.com.conversor.model.alura;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        Moeda moeda = new Moeda();
        String resp;

        // Opções para o dropdown
        String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };

        // Mostra o dropdown usando o JOptionPane
        String selecao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0] // Opção selecionada por padrão
        );

        if (selecao != null) {
            int resposta = JOptionPane.showOptionDialog(null,
                    " ", "Conversor de Moedas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, new String[] {
                            "Dolares", "Euro", "LIBRAS ESTERLINAS", "peso Argentino", "peso Chileno"
                    }, "default");

            // tratamento da resposta do botão clicado
            resp = JOptionPane.showInputDialog(null, "Digite um valor:");
            resp = resp.trim();
            moeda.setValor(Double.parseDouble(resp));

            // Perform the conversion based on the selected currency
            String[] currencies = { "Dolares", "Euro", "LIBRAS ESTERLINAS", "peso Argentino", "peso Chileno"};
            String tipoConversao = "de reais para " + currencies[resposta];
            double convertedValue = moeda.converter(tipoConversao);
            JOptionPane.showMessageDialog(null,
                    "O valor convertido é: " + String.format("%.2f",convertedValue),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
