package im�vel;
import javax.swing.JOptionPane;

public class teste{
	
public static void main (String[] args) {
	int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe: 1 - im�vel velho e 2 - im�vel novo"));
		while (a < 1 || a > 2) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Erro!! informe novamente: 1 - im�vel velho e 2 - im�vel novo"));
		}
		if (a == 1) {
			imovelvelho iv1 = new imovelvelho();
			iv1.setEndereco(JOptionPane.showInputDialog("Informe o endere�o: "));
			iv1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de desconto: ")));
			iv1.addesconto();
			JOptionPane.showMessageDialog(null, "O valor � " + iv1.descontar() + " no endere�o: " + iv1.getEndereco());
		}else{
			ImovelNovo iv1 = new ImovelNovo();
			iv1.setEndereco(JOptionPane.showInputDialog("Informe o endere�o: "));
			iv1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor adicional: ")));
			iv1.adcionar();
			JOptionPane.showMessageDialog(null, "O valor � " + iv1.adcionar() + " no endere�o: " + iv1.getEndereco());
		}
		
}
}