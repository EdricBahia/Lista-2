package imóvel;
import javax.swing.JOptionPane;
public class imovelvelho extends imovel {
	private Double desconto;
	
	
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public void addesconto() {
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser descontado: "));
	}
	public void mostrardesc () {
		JOptionPane.showMessageDialog (null, desconto);
	}
	public double descontar() {
		desconto = this.getPreco() - this.desconto;
		return desconto;
	}
}