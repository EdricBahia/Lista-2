package imóvel;
import javax.swing.JOptionPane;
public class ImovelNovo extends imovel {
	private Double extra;

	public Double getPrecoad() {
		return extra;
	}

	public void setPrecoad(Double precoad) {
		this.extra = precoad;
	}

public void adicional() {
	extra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do preço adicional"));
	}
public void mostrarad () {
	JOptionPane.showMessageDialog (null, extra);
	}
public double adcionar() {
	extra = this.getPreco() - this.extra;
	return extra;
}
}