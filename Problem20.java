import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class P20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame JF=new JFrame("TemperatureConverter");
		JF.setSize(350,200);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel JP=new JPanel(null);
		JF.getContentPane().add(JP);
		final JLabel L1=new JLabel("Enter Temperature :");
		L1.setBounds(20, 50, 120, 20);
		JP.add(L1);
		final JTextField T1=new JTextField("");
		T1.setBounds(140, 50,90,20);
		JP.add(T1);
		JButton B1=new JButton("Convert!");
		B1.setBounds(230,50,90, 20);
		JP.add(B1);
		JLabel L2=new JLabel("Converted Temperture :");
		L2.setBounds(20, 100, 140, 20);
		JP.add(L2);
		final JLabel L3=new JLabel("..........");
		L3.setBounds(160, 100, 150, 20);
		JP.add(L3);
		JF.setResizable(false);
		JF.setVisible(true);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String S=""+T1.getText();
				int tmp=Integer.parseInt(S);
				L3.setText(Double.toString((5/9.0)*(tmp-32))+" C");
				
			}
		});

	}

}
