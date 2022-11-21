import java.util.Scanner;

public class Q7_uniqueCharacter {

	public static void main(String[] args) {
		//unique character----no character is repeated
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String:");
		String s=sc.nextLine();
		s=s.replace(" ","");
		boolean f=false;
		int n=s.length();
		char [] ch=new char[n];
		 for(int i=0;i<n;i++)
		 {
			 ch[i]=s.charAt(i);
		 }
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{   f=true;
					break;
					
				}
				
			}
			
		}
		if(f==false)
        {
        	System.out.println("Unique Character only");
        }
		else if(f==true)
		{
			System.out.println("Dublicate Character found");
		}
	}

}
