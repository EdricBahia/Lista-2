package imóvel;
import javax.swing.JOptionPane;

public class teste{
	
public static void main (String[] args) {
	int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe: 1 - imóvel velho e 2 - imóvel novo"));
		while (a < 1 || a > 2) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Erro!! informe novamente: 1 - imóvel velho e 2 - imóvel novo"));
		}
		if (a == 1) {
			imovelvelho iv1 = new imovelvelho();
			iv1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
			iv1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de desconto: ")));
			iv1.addesconto();
			JOptionPane.showMessageDialog(null, "O valor é " + iv1.descontar() + " no endereço: " + iv1.getEndereco());
		}else{
			ImovelNovo iv1 = new ImovelNovo();
			iv1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
			iv1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor adicional: ")));
			iv1.adcionar();
			JOptionPane.showMessageDialog(null, "O valor é " + iv1.adcionar() + " no endereço: " + iv1.getEndereco());
		}
		
}
}