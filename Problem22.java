import java.util.*;
public class P22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 = new String("Welcome to Tutorialspoint.com");
	      String Str2 = new String("Tutorials");
	      String Str3 = new String("TUTORIALS");

	      System.out.print("Return Value :" );
	      System.out.println(Str1.regionMatches(11, Str2, 0, 9));

	      System.out.print("Return Value :" );
	      System.out.println(Str1.regionMatches(true, 11, Str3, 0, 9));
	}

}
