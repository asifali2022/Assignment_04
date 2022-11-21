import java.util.*;

public class Q5_anagramCheck {

	public static void main(String[] args) {
		
		 //inputting two string
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter A String:");
		 String s=sc.nextLine();
		 System.out.println("Enter Anagram:");
		 String s2=sc.nextLine();
		 //converting to lower case
		 s=s.toLowerCase();
		 s2=s2.toLowerCase();
		 
		 //removing " " between characters
		 s=s.replace(" ","");
		 s2=s2.replace(" ","");
		 //length of string
		 int n=s.length();
		 int m=s.length();
		 //converting to  arrays
		 char [] sa=new char[n];
		 char [] s2a=new char[m];
		 // sorting arrays
		 Arrays.sort(sa);
		 Arrays.sort(s2a);
		 //
		 if(Arrays.equals(sa,s2a))
		 {
			 System.out.println("It is a Anagram");
		 }
		 else
		 {
			 System.out.println("It is Not a Anagram of");
		 }
		
		 

	}

}
