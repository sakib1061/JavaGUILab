import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String S=sc.nextLine();
String ar[] = new String [60];
int r=0;
for(int i=0;i<5;i++)
	for(int j=0;j<5;j++)
		for(int k=0;k<5;k++)
			if(i==j || i==k || j==k)
				continue;
			else 
				ar[r++]=S.valueOf(S.charAt(i))+S.charAt(j)+S.charAt(k);
Set<String> set=new HashSet<String>(Arrays.asList(ar));
ar=set.toArray(new String[set.size()]);
for(int i=0;i<ar.length;i++)
	System.out.println(ar[i]);
	}

}
