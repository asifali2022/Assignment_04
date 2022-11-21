import java.util.Scanner;

public class Q4_consonantVowelsSpecialCharacter {
               	 public static void main(String[] args) {
				 System.out.println("***************************************");
               	 Scanner sc=new Scanner(System.in);
				 System.out.println("Enter A String:");
				 String s=sc.nextLine();
				 //
				 int consonantCount=0;
				 int vowelsCount=0;
				 int numberCount=0;
				 int specialCharacterCount=0;
				 //
				 //string to array conversion
				 int m=s.length();
				 char[] q=new char[m];
				 for(int i=0;i<m;i++)
				 {
					 q[i]=s.charAt(i);
				 }
				 //counting
				for(int i=0; i<q.length;i++)
				{
					if( (q[i]>='a'&& q[i]<='z') ||(q[i]>='A'&& q[i]<='Z') )
					{
						if( q[i]=='a'||q[i]=='e'||q[i]=='i'||q[i]=='o'||q[i]=='u'
						  ||q[i]=='A'||q[i]=='E'||q[i]=='I'||q[i]=='O'||q[i]=='U' )
							{
								vowelsCount++;
							}
						else
							{
							consonantCount++;
							}
					}
					else if( (q[i]>='0' && q[i]<='9') )
					{
						numberCount++;
					}
					else
					{
						specialCharacterCount++;
					}
				}
				System.out.println("number of consonants are: "+consonantCount);
				System.out.println("number of vowels are: "+vowelsCount);
				System.out.println("number of numbers are: "+numberCount);
				System.out.println("number of specialCharacter are: "+specialCharacterCount);
			}

		}


