import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Operazioni implements ActionListener
{
	private JButton moltiplica; 
	private JButton addiziona; 
	private JButton sottrai; 
	private JButton dividi; 
	private JLabel output;
	
	public Operazioni(JButton moltiplica, JButton addiziona, JButton sottrai, JButton dividi, JLabel output) 
	{
		this.output = output;
		this.moltiplica = moltiplica;
		this.addiziona = addiziona;
		this.sottrai = sottrai;
		this.dividi = dividi;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
