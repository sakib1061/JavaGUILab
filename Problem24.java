import java.util.Scanner;


public class P24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String S=sc.nextLine();
char c=sc.next().charAt(0);
int index = S.indexOf(c),counter=0;
while (index >= 0) {
    System.out.println(index);
    if(index>=0)
    	counter++;
    index = S.indexOf(c, index + 1);
}
System.out.println(c+ " Found " + counter + " Times");
	}

}
