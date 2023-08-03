package br.com.meucurso.cm.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.meucurso.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
	}
	
}
