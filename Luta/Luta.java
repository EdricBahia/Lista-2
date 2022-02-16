package Lista2;

import javax.swing.JOptionPane;

public class Luta {
	public Lutador desafiado;
	public Lutador desafiante;
	public Lutador vencedor;
	public int dia;
	public int mes;
	public int o;
	
	public void lutar (Lutador l1, Lutador l2) {
		o = Integer.parseInt(JOptionPane.showInputDialog( "Quem será o desafiante:  lutador1 - 1 ou lutador2 - 2"));
		if(o == 1){
            this.desafiado = l2;
            this.desafiante = l1;
        }else{
        	this.desafiado = l1;
            this.desafiante = l2;
        }
	}
	public void data () {
		dia = Integer.parseInt(JOptionPane.showInputDialog( "Digite o dia"));
		
		mes = Integer.parseInt(JOptionPane.showInputDialog( "Digite o mês"));

	}
	public void vencedor (Lutador l1, Lutador l2) {
		o = Integer.parseInt(JOptionPane.showInputDialog( "Quem ganhou:  lutador1 - 1 ou lutador2 - 2"));
		if(o == 1){
			l1.nvit();
			l2.nder();
        }else{
        	l1.nder();
			l2.nvit();
		if(o == 3) {
			l1.nemp();
			l2.nemp();
		}
        }
	}
}

