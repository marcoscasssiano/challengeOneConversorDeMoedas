package ConversorMoedas;
import javax.swing.JOptionPane;


public class ConverterMoedas {

	public static void main(String[] args) {

		FuncaoConverter converter = new FuncaoConverter();

		while (true) {
			String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor De Moedas",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Converter para Dolar",
							"Converter para Euro", "Converter para LIbra", "Converter para Dolar Canadense" },
					"Escolha").toString();

			switch (opcoes) {

			case "Converter para Dolar":
				String valorRealParaDolar = JOptionPane.showInputDialog("Insira um valor em reais");
				double valorDolar = Double.parseDouble(valorRealParaDolar);
				converter.ConversorDeRealParaDolar(valorDolar);
				int valorOpcaoDolar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (valorOpcaoDolar == JOptionPane.YES_OPTION) {
				break;

				} else if (valorOpcaoDolar == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "O Programa será finalizado!");
					System.exit(valorOpcaoDolar);
				break;
					

				} else if (valorOpcaoDolar == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa concluido!");
					JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					break;
					
				}
						
						
			case "Converter para Euro":
				String valorRealParaEuro = JOptionPane.showInputDialog("Insira um valor em reais");
				double valorEuro = Double.parseDouble(valorRealParaEuro);
				converter.ConversorDeRealParaEuro(valorEuro);
				int valorOpcaoDolarEuro = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (valorOpcaoDolarEuro == JOptionPane.YES_OPTION) {
				break;

				} else if (valorOpcaoDolarEuro == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "O programa será finalizado!");
					System.exit(valorOpcaoDolarEuro);
				break;


				} else if (valorOpcaoDolarEuro == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa concluido!");
					JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				break;
					
				}
				
				
			case "Converter para LIbra":
				String valorRealParaLibra = JOptionPane.showInputDialog("Insira um valor em reais");
				double valorLibra = Double.parseDouble(valorRealParaLibra);
				converter.ConversorDeRealParaLibra(valorLibra);
				int valorOpcaoDolarLibra = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (valorOpcaoDolarLibra == JOptionPane.YES_OPTION) {
				break;

				} else if (valorOpcaoDolarLibra == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "O programa será finalizado!");
					System.exit(valorOpcaoDolarLibra);
				break;

				} else if (valorOpcaoDolarLibra == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa concluido!");
					JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				break;
					
				}
				
				

			case "Converter para Dolar Canadense":
				String valorRealParaDolarCanadense = JOptionPane.showInputDialog("Insira um valor em reais");
				double valorDolarCanadense = Double.parseDouble(valorRealParaDolarCanadense);
				converter.ConversorDeRealParaDolarCanadense(valorDolarCanadense);
				int valorOpcaoDolarCanandense = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if (valorOpcaoDolarCanandense == JOptionPane.YES_OPTION) {
				break;

				} else if (valorOpcaoDolarCanandense == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "O programa será finalizado!");
					System.exit(valorOpcaoDolarCanandense);
				break;

				} else if (valorOpcaoDolarCanandense == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa concluido!");
					JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				break;
					
				}

			}

		}
	}

}