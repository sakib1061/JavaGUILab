import java.util.Scanner;
import java.util.StringTokenizer;


public class P25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
String s=Sc.nextLine();
StringTokenizer st = new StringTokenizer(s);
while (st.hasMoreTokens()) {
	String T=st.nextToken();
	if(T.charAt(0)=='B')
    System.out.println(T);
}
	}

}
