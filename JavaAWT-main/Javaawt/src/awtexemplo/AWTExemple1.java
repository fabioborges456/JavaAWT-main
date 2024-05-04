package awtexemplo;

import java.awt.Button;
import java.awt.Frame;

public class AWTExemple1 extends Frame {    
	   
	      AWTExemple1(){     
	      Button b = new Button("Clique aqui!!");    
	      b.setBounds(30,100,80,30);      
	      add(b);      
	      setSize(300,300);    
	      setTitle("Exemplo basico de Java AWT");      
	      setLayout(null);       
	      setVisible(true);  
	}    
	public static void main(String args[]) {      
    AWTExemple1 frame = new AWTExemple1();    
	  
	}  
}
