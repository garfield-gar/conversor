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
                            "Dolares", "Euro", "LIBRAS ESTARLINAS", "peso Argentino", "peso Chileno"
                    }, "default");

            // tratamento da resposta do botão clicado
            resp = JOptionPane.showInputDialog(null, "Digite um valor:");
            resp = resp.trim();
            moeda.setValor(Double.parseDouble(resp));

            // Perform the conversion based on the selected currency
            String[] currencies = { "dolares", "euro", "libras esterlinas", "peso argentino", "peso chileno" };
            String tipoConversao = "de reais a " + currencies[resposta];
            double convertedValue = moeda.converter(tipoConversao);
            JOptionPane.showMessageDialog(null,
                    "O valor convertido é: " + String.format("%.2f",convertedValue),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            int resposta = JOptionPane.showOptionDialog(null,
                    " ", "Conversor de Moedas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, new String[] {
                            "Celsius", "Fahrenheit", "Kelvin"
                    }, "default");

            // tratamento da resposta do botão clicado
            resp = JOptionPane.showInputDialog(null, "Digite um valor em Celsius:");
            resp = resp.trim();

            // Perform the temperature conversion (implement this part as needed)
        }
    }
}
