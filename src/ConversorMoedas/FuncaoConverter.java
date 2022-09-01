package ConversorMoedas;
import javax.swing.JOptionPane;

public class FuncaoConverter {
	
	public void ConversorDeRealParaDolar(double valorEmReal) {
		double valorConvertidoEmDolar = valorEmReal / 5.07;
		valorConvertidoEmDolar = (double) Math.round(valorConvertidoEmDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmDolar + " Dolares");

	}
	
	public void ConversorDeRealParaEuro(double valorEmReal) {
		double valorConvertidoEmEuro = valorEmReal / 5.08;
		valorConvertidoEmEuro = (double) Math.round(valorConvertidoEmEuro * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $" + valorConvertidoEmEuro + " Euro");

	}
	
	public void ConversorDeRealParaLibra(double valorEmReal) {
		double valorConvertidoEmLibra = valorEmReal /5.92;
		valorConvertidoEmLibra = (double) Math.round(valorConvertidoEmLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmLibra + " Libra");

	}
	
	public void ConversorDeRealParaDolarCanadense(double valorEmReal) {
		double valorConvertidoEmDolarCanadense = valorEmReal /3.90;
		valorConvertidoEmDolarCanadense = (double) Math.round(valorConvertidoEmDolarCanadense * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmDolarCanadense + " Dolar Canadense");

	}


}