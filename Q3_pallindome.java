

public class Q3_pallindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="2552";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s2.equals(s))
		{
			System.out.println(s2+" Is Pallindrome");
		}
		else
		{
			System.out.println(s2+" Is Not Pallindrome");
		}
	}

}
