package br.dev.davi.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

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
	   tela.setSize(400, 700);
	   tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   tela.setLayout(null);											
	   
	    //Criar os componetes da tela 
	   
	   labelMultiplicando = new JLabel();
	   labelMultiplicando.setText("Multiplicando: ");
	   labelMultiplicando.setBounds(20,20, 150, 30);
	  
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
	   
	   
	   //criação de botão
	   buttonCalcular = new JButton();
	   buttonCalcular.setText("calcular: ");
	   tela.setBounds(20, 140, 100, 40);
	  
	   //obtemos o painel de conteudo e adicionamos o labelMultiplicando nesse painel 
	   tela.getContentPane().add(labelMultiplicando);
	   tela.getContentPane().add(labelMinimoMultiplicando);
	   tela.getContentPane().add(labelMaximoMultiplicando);
	   tela.getContentPane().add(textMultiplicando);
	   tela.getContentPane().add(textMinimoMultiplicando);
	   tela.getContentPane().add(textMaximoMultiplicando);
	   tela.getContentPane().add(buttonCalcular);
	   
	   
	   //Essa linha deve ser a ultima linha 
	   tela.setVisible(true);
	   
	  
	   
	   
   }
   
 }
   

