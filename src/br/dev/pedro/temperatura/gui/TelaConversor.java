package br.dev.pedro.temperatura.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.pedro.temperatura.model.Temperatura;

public class TelaConversor {
	private JLabel labelCelsius;
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	
	public void criarTelaConversor () {
		
//		Criando Tela 
		
		JFrame tela = new JFrame();
		
		Dimension tamanho = new Dimension();
		
		tamanho.setSize(500, 500);
		
		tela.setSize(tamanho);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		tela.setLayout(null);
		
		
		// PARTE DO CELSIUS
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em Graus Celsius:");
		labelCelsius.setBounds(50, 30, 200, 30);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(50, 70, 400, 30);
		
		
		// LABEL RESULTADO
		
		labelResultado = new JLabel();
		labelResultado.setBounds(150, 150, 200, 40);
		
		
		//LABEL ERRO
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setBounds(150, 180, 200, 40);
		labelMensagemErro.setText("TESTE");
		
		
		//BOTÕES KELVIN
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(50, 110, 200, 40);
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				try {
					double celsius = Double.parseDouble(textCelsius.getText());
				
					temperatura.setCelsius(celsius);
					double kelvin = temperatura.converterParaKelvin();
				
					labelResultado.setText(kelvin + " KELVIN :D");
					labelMensagemErro.setText("");
				
					}catch(Exception erro) {
						
						labelMensagemErro.setText("Digite Apenas Números!");
						labelResultado.setText("");
					}
				
				
			}
		});
	
		
		
		//BOTÕES FAHREINHEIT
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(250, 110, 200, 40);
		buttonFahreinheit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Temperatura temperatura = new Temperatura();
						
						try {
							
						
							double celsius = Double.parseDouble(textCelsius.getText());
						
							temperatura.setCelsius(celsius);
							double fahreinheit = temperatura.converterParaFahrenheit();
						
							labelResultado.setText(fahreinheit + " FAHREINHEIT :D");
							labelMensagemErro.setText("");
							}catch(Exception erro) {
								labelMensagemErro.setText("Digite Apenas Números!");
								labelResultado.setText("");
								
							}
						
						
					}
				});
		
		
		
		
		
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		
		
		
		
		tela.setVisible(true);
	}
}
