import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calcolatrice 
{

	public static void main(String[] args) 
	{
		// Tema più bellino
		try 
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		// Creo la finestra
		JFrame			calcolatrice = new JFrame("Calcolatrice in Java");
		calcolatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container		contenuto = calcolatrice.getContentPane();
		contenuto.setLayout(new GridLayout(4, 2));
		
		// Aggiungo i campi di input
		JTextField		campo0		= new JTextField("0", 25);
		JTextField		campo1		= new JTextField("0", 25);
		JLabel			tot			= new JLabel("TOTALE");
				
		//contenuto.add(new JLabel("Campo 0"));
		contenuto.add(campo0);
		
		//contenuto.add(new JLabel("Campo 1"));
		contenuto.add(campo1);
		
		JButton tmp = new JButton("+");
		contenuto.add("addiziona", tmp);
		
		tmp = new JButton("*");
		contenuto.add("moltplica", tmp);
		
		tmp = new JButton("-");
		contenuto.add("sottrai", tmp);
		
		tmp = new JButton("/");
		contenuto.add("dividi", tmp);
		
		contenuto.add(tot);
		JTextField		totale = new JTextField();
		totale.setEditable(false);
		contenuto.add("totale", totale);

		
		// Mostro la finestra
		calcolatrice.pack();
		calcolatrice.setResizable(false);
		calcolatrice.setVisible(true);
	}

}
