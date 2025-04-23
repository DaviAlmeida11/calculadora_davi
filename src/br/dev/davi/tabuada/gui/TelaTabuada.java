package br.dev.davi.tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Tabuada;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinimoMultiplicando;
	private JLabel labelMaximoMultiplicando;
	private JTextField textMultiplicando;
	private JTextField textMinimoMultiplicando;
	private JTextField textMaximoMultiplicando;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listarTabuada;

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

	public void criarTelaTabuada() {

		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(270, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);

		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(200, 20, 50, 30);

		labelMinimoMultiplicando = new JLabel();
		labelMinimoMultiplicando.setText("Min. multiplicando: ");
		labelMinimoMultiplicando.setBounds(20, 70, 150, 30);

		textMinimoMultiplicando = new JTextField();
		textMinimoMultiplicando.setBounds(200, 70, 50, 30);

		labelMaximoMultiplicando = new JLabel();
		labelMaximoMultiplicando.setText("Max. multiplicando: ");
		labelMaximoMultiplicando.setBounds(20, 120, 150, 30);

		textMaximoMultiplicando = new JTextField();
		textMaximoMultiplicando.setBounds(200, 120, 50, 30);

		// criação de botão
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 170, 95, 30);

		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(140, 170, 95, 30);

		// criação de scroll
		listarTabuada = new JList();
		String[] alunos = {

		};
		listarTabuada = new JList();
		listarTabuada.setListData(alunos);

		// Criação do objeto scroll
		scrollTabuada = new JScrollPane(listarTabuada);
		scrollTabuada.setBounds(15, 220, 225, 300);

		// obtemos o painel de conteudo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicando);
		tela.getContentPane().add(labelMaximoMultiplicando);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinimoMultiplicando);
		tela.getContentPane().add(textMaximoMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);

		// adiciocar ouvinte de evento aos botões
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();

				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);

				String min = textMinimoMultiplicando.getText();
				double minDouble = Double.valueOf(min);
				tabuada.setMinimoMultiplicando(minDouble);

				String max = textMaximoMultiplicando.getText();
				double maxDouble = Double.valueOf(max);
				tabuada.setMaximoMultiplicador(maxDouble);

				String[] tabuadaResultado = tabuada.mostrarTabuada();

				listarTabuada.setListData(tabuadaResultado);

			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textMinimoMultiplicando.setText(null);
				textMaximoMultiplicando.setText(null);
				textMultiplicando.setText(null);

				listarTabuada.setListData(new String[0]);

			}
		});

		// Essa linha deve ser a ultima linha
		tela.setVisible(true);

	}

}
