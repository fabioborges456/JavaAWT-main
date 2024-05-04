package awtexemplo;

import java.awt.Frame;
import java.awt.TextField;

public class AWTExemplo3 {

	public static void main(String[]args) {
		Frame quadro = new Frame("Exemplo de TextField");
		
		TextField t1,t2;
		
		t1 = new TextField("Bem vindos ao TextField");
		t1.setBounds(50,100,200,30);
		
		t2 = new TextField("Bem vindos ao TextField 2");
		t2.setBounds(50,150,200,30);
		
		quadro.add(t1);
		quadro.add(t2);
		
		quadro.setSize(400,400);
		quadro.setLayout(null);
		quadro.setVisible(true);
	}
}
