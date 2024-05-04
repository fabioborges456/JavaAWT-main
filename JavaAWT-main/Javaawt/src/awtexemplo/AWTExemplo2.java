package awtexemplo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTExemplo2 {
	
	AWTExemplo2(){
		
		Frame quadro = new Frame();
		Label etiqueta = new Label("ID Empregado");
		Button botao = new Button("Enviar");
		TextField campodeTexto = new TextField();
		
		etiqueta.setBounds(20,80,80,30);
		campodeTexto.setBounds(20,100,80,30);
		botao.setBounds(100,100,80,30);
		
		quadro.add(campodeTexto);
		quadro.add(botao);
		quadro.add(etiqueta);
		
		quadro.setSize(400,300);
		quadro.setTitle("Informações do Empregado");
		quadro.setLayout(null);
		quadro.setVisible(true);
		
	}
	public static void main(String[]args) {
			AWTExemplo2 objAWT = new AWTExemplo2();
		
		
	}

}
