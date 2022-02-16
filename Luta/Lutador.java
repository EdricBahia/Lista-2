package Lista2;

import javax.swing.JOptionPane; 

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private int vit;
	private int der;
	private int emp;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getDer() {
		return der;
	}
	public void setDer(int der) {
		this.der = der;
	}
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}

	public String adnome() {
		nome = JOptionPane.showInputDialog( "Adicione o nome: ");
		return this.nome;
	}
	public String adnaci() {
		nacionalidade = JOptionPane.showInputDialog( "Adcione a nacionalidade: ");
		return this.nacionalidade;
	
	}
	public int adidade() {
		idade = Integer.parseInt(JOptionPane.showInputDialog( "Adicione a idade: "));
		return this.idade;
	}
	public double adpeso() {
		peso = Double.parseDouble(JOptionPane.showInputDialog( "Adicione o peso: "));
		return this.peso;
		
	}public double adaltura() {
		altura = Double.parseDouble(JOptionPane.showInputDialog( "Adicione a altura: "));
		return this.altura;
	}
	public double advit() {
		vit = Integer.parseInt(JOptionPane.showInputDialog( "Adicione a quantidade de vitórias: "));
		return this.vit;
	}
	public double adder() {
		der = Integer.parseInt(JOptionPane.showInputDialog( "Adicione a quantidade de derrotas:"));
		return this.der;
	}public double ademp() {
		emp = Integer.parseInt(JOptionPane.showInputDialog( "Adicione a quantidade de empates: "));
		return this.emp;
	}
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "NOME: "+ this.nome +"\nNACIONALIDADE: "+ this.nacionalidade +"\nIDADE: "+ this.idade +"\nALTURA: "+ this.altura +"\nPESO: "+ this.peso +"\nVITÓRIAS: "+ this.vit +"\nDERROTAS: "+ this.der +"\nEMPATES: "+ this.emp);
	}
	public void nvit() {
		this.vit = this.vit + 1;
	}
	public void nder() {
		this.der = this.der + 1;
	}
	public void nemp() {
		this.emp = this.emp + 1;
	}
	public static void main (String[]args) {
		Lutador l1 = new Lutador();

		l1.adnome();
		l1.adnaci();
		l1.adidade();
		l1.adpeso();
		l1.adaltura();
		l1.advit();
		l1.adder();
		l1.ademp();
		l1.apresentacao();
		
		Lutador l2 = new Lutador();
		l2.adnome();
		l2.adnaci();
		l2.adidade();
		l2.adpeso();
		l2.adaltura();
		l2.advit();
		l2.adder();
		l2.ademp();
		l2.apresentacao();
		
		Luta lu = new Luta ();
		lu.lutar(l1, l2);
		lu.data();
		lu.vencedor(l1, l2);
		l1.apresentacao();
		l2.apresentacao();
		}
}
