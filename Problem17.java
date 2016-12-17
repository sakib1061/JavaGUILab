import javax.swing.*;


public class P17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame FR=new JFrame("Calculator");
			FR.setSize(246, 228);
			FR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel JP=new JPanel(null);
			FR.getContentPane().add(JP);
			JTextField JT=new JTextField();
			JT.setBounds(0, 0, 300, 40);
			JP.add(JT);
			
			JButton B7=new JButton("7");
			B7.setBounds(0, 40, 60, 40);
			JP.add(B7);
			JButton B8=new JButton("8");
			B8.setBounds(60, 40, 60, 40);
			JP.add(B8);
			JButton B9=new JButton("9");
			B9.setBounds(120, 40, 60, 40);
			JP.add(B9);
			JButton BD=new JButton("/");
			BD.setBounds(180, 40, 60, 40);
			JP.add(BD);
			JButton B4=new JButton("4");
			B4.setBounds(0, 80, 60, 40);
			JP.add(B4);
			JButton B5=new JButton("5");
			B5.setBounds(60, 80, 60, 40);
			JP.add(B5);
			JButton B6=new JButton("6");
			B6.setBounds(120, 80, 60, 40);
			JP.add(B6);
			JButton BM=new JButton("*");
			BM.setBounds(180, 80, 60, 40);
			JP.add(BM);
			JButton B1=new JButton("1");
			B1.setBounds(0, 120, 60, 40);
			JP.add(B1);
			JButton B2=new JButton("2");
			B2.setBounds(60, 120, 60, 40);
			JP.add(B2);
			JButton B3=new JButton("3");
			B3.setBounds(120, 120, 60, 40);
			JP.add(B3);
			JButton BS=new JButton("*");
			BS.setBounds(180, 120, 60, 40);
			JP.add(BS);
			JButton B0=new JButton("0");
			B0.setBounds(0, 160, 60, 40);
			JP.add(B0);
			JButton BB=new JButton(".");
			BB.setBounds(60, 160, 60, 40);
			JP.add(BB);
			JButton BE=new JButton("=");
			BE.setBounds(120, 160, 60, 40);
			JP.add(BE);
			JButton BP=new JButton("+");
			BP.setBounds(180, 160, 60, 40);
			JP.add(BP);
			FR.setResizable(false);
			FR.setVisible(true);
	}

}
