package br.com.rws.cm.visao;

import javax.swing.JFrame;

import br.com.rws.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 15);
		// PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		add(new PainelTabuleiro(tabuleiro));

		setVisible(true);
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
