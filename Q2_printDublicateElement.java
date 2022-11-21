import java.util.Scanner;

public class Q2_printDublicateElement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter A String With Dublicates:");
		 String s=sc.nextLine();
		 int m=s.length();
		
		 char[] q=new char[m];
		 for(int i=0;i<m;i++)
		 {
			 q[i]=s.charAt(i);
		 }
		 
		 int h=q.length;
		 int count=0;		 
		 //finding duplicates elements
		 for(int i=0;i<h;i++) 
		 {
			 count=1;
			for( int j=i+1;j<h;j++)
			{
				if(q[i]==q[j] ) 
				{
					count++;
				    q[j]='0';
				}
			}
			
		 if(count>1 && q[i]!='0')
		 {
			 System.out.print(q[i]);
		 }
	}

}
}