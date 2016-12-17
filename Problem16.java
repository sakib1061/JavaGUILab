import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class P16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame FR=new JFrame("Align");
FR.setSize(300,200);
FR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
FR.setResizable(false);

JPanel JP=new JPanel(null);
FR.getContentPane().add(JP);
JCheckBox STG=new JCheckBox("Snap To Grid");
STG.setBounds(10, 40, 100, 15);
JP.add(STG);
JCheckBox SG=new JCheckBox("Snap Grid");
SG.setBounds(10, 55, 100, 15);
JP.add(SG);
JLabel X=new JLabel("X:");	
X.setBounds(125, 40, 20, 15);
JP.add(X);
JLabel Y=new JLabel("Y:");	
Y.setBounds(125, 55, 20, 15);
JP.add(Y);
JTextField XT=new JTextField("8");
XT.setBounds(150, 40,15,15);
JP.add(XT);
JTextField YT=new JTextField("8");
YT.setBounds(150, 55,15,15);
JP.add(YT);
JButton OK=new JButton("OK");
OK.setBounds(200, 30, 100, 20);
JP.add(OK);
JButton HELP=new JButton("HELP");
HELP.setBounds(200, 55, 100, 20);
JP.add(HELP);
JButton CANCEL=new JButton("CANCEL");
CANCEL.setBounds(200, 80, 100, 20);
JP.add(CANCEL);
FR.setVisible(true);
	}

}
