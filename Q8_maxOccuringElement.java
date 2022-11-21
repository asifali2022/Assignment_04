import java.util.Scanner;

public class Q8_maxOccuringElement {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String:");
		String s=sc.nextLine();
	    int n=s.length();
		final int asii_size=256;
		 int [] count = new int [asii_size];
		 for(int i=0;i<s.length();i++)
		 {
			 count[s.charAt(i)]++;
		 }
		int mx=-1;
		char fch=' ';
		for(int i=0;i<s.length();i++)
		{
			if(mx<count[s.charAt(i)])
			{
				mx=count[s.charAt(i)];
				fch=s.charAt(i);
			}
		}
     System.out.println(fch+" Is The Maximum Occuring Character in A String And Its Count Is: "+mx);
	}

}
