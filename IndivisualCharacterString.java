public class IndivisualCharacterString
{
public static void main(String args[])
	{
		String s1="Java Learner";
		int lengthofString=s1.length();
		for(int i=0; i<lengthofString; i++)
		{
			char currentChar=s1.charAt(i);
			System.out.print(currentChar);
		}
	}
}