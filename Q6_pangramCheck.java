
public class Q6_pangramCheck {

	public static void main(String[] args) {
		//
		String s="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		String s1 = s.replace(" ","");
		s1=s1.toLowerCase();
		int n=s1.length();
		boolean f=false;
		char [] ch=new char[n];
		 for(int i=0;i<n;i++)
		 {
			 ch[i]=s1.charAt(i);
		 }
		int  ar []=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int indx=ch[i]-97;
			ar[indx]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{   f=true;
				System.out.println(s+" Is Not Panagram");
			}
			
		}
        if(f==false)
        {
        	System.out.println(s+" Is A Panagram");
        }
	}

}
