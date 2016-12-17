import javax.swing.*;
public class P18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list[]={"Red","Blue","Green"};
		JFrame JF=new JFrame("ColorSelect");
		JF.setSize(300,200);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel JP=new JPanel(null);
		JF.getContentPane().add(JP);
		JComboBox JC=new JComboBox(list);
		JC.setBounds(0,0,300,30);
		JP.add(JC);
		JCheckBox BG=new JCheckBox("Background");
		BG.setBounds(50,50,100,30);
		JP.add(BG);
		JCheckBox FG=new JCheckBox("Foreground");
		FG.setBounds(150,50,100,30);
		JP.add(FG);
		JButton OK=new JButton("OK");
		OK.setBounds(50,100,80,30);
		JP.add(OK);
		JButton CANCEL=new JButton("CANCEL");
		CANCEL.setBounds(135,100,100,30);
		JP.add(CANCEL);
		JF.setResizable(false);
		JF.setVisible(true);
	}

}
