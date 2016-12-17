import javax.swing.*;


public class P19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list[]={"HIGH","LOW"};
		JFrame JF=new JFrame("Printer");
		JF.setSize(500,200);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel JP=new JPanel(null);
		JF.getContentPane().add(JP);
		JLabel T1=new JLabel("Printer:MyPrinter");
		T1.setBounds(30,30,100,20);
		JP.add(T1);
		ImageIcon IM=new ImageIcon("G:\\cste.jpg");
		JLabel IL=new JLabel();
		IL.setIcon(IM);
		IL.setBounds(30,50,60,80);
		JP.add(IL);
		JCheckBox IMAGE=new JCheckBox("Image");
		IMAGE.setBounds(95,60,70,15);
		JP.add(IMAGE);
		JCheckBox TEXT=new JCheckBox("Text");
		TEXT.setBounds(95,80,70,15);
		JP.add(TEXT);
		JCheckBox CODE=new JCheckBox("Code");
		CODE.setBounds(95,100,70,15);
		JP.add(CODE);
		ImageIcon IM1=new ImageIcon("G:\\cste.jpg");
		JLabel IL1=new JLabel();
		IL1.setIcon(IM1);
		IL1.setBounds(165,50,60,80);
		JP.add(IL1);
		JRadioButton SELECTION=new JRadioButton("Selection");
		SELECTION.setBounds(225,60,90,15);
		JP.add(SELECTION);
		JRadioButton ALL=new JRadioButton("ALL");
		ALL.setBounds(225,80,90,15);
		JP.add(ALL);
		JRadioButton APPLET=new JRadioButton("APPLET");
		APPLET.setBounds(225,100,90,15);
		JP.add(APPLET);
		ImageIcon IM2=new ImageIcon("G:\\cste.jpg");
		JLabel IL2=new JLabel();
		IL2.setIcon(IM2);
		IL2.setBounds(315,50,60,80);
		JP.add(IL2);
		JLabel TEXT1 =new JLabel("Print Quality:");
		TEXT1.setBounds(50, 135, 80, 20);
		JP.add(TEXT1);
		JComboBox JC=new JComboBox(list);
		JC.setBounds(130, 135, 80,20);
		JP.add(JC);
		JCheckBox LC=new JCheckBox("Print To File");
		LC.setBounds(215, 135, 100, 20);
		JP.add(LC);
		JButton J1=new JButton("OK");
		J1.setBounds(390,35,80,20);
		JP.add(J1);
		JButton J2=new JButton("Cancel");
		J2.setBounds(390,60,80,20);
		JP.add(J2);
		JButton J3=new JButton("SetUp");
		J3.setBounds(390,85,80,20);
		JP.add(J3);
		JButton J4=new JButton("Help");
		J4.setBounds(390,110,80,20);
		JP.add(J4);
		JF.setResizable(false);
		JF.setVisible(true);
	}

}
