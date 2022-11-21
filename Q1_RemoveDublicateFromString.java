import java.util.Scanner;

public class Q1_RemoveDublicateFromString {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter A String With Dublicates:");
		 char[] s=sc.nextLine().toCharArray();
		 String s2="";
		 for(char x:s)
		 {
			 if(s2.indexOf(x)==-1)
			 {
				 s2=s2+x;
			 }
		 }
		 System.out.println(s2);
		 
	}
}