import java.util.Scanner;
import java.util.Arrays;
class StringWorld
{
	void reverseString(String s)
	{
		String rev = "";
		for(int i = 0; i < s.length(); i++)
		{
			rev = rev + s.charAt(s.length() - i - 1);
		}
		System.out.println("Reverse of this string is : " + rev);
	}
	
	void checkPalindrome(String s)
	{
		s = s.toLowerCase();
		String rev = "";
		for(int i = 0; i < s.length(); i++)
		{
			rev = rev + s.charAt(s.length() - i - 1);
		}
		if(s.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}
	
	void checkAnagram(String s1 , String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length() == s2.length())
		{
			char[] text1 = s1.toCharArray();
			char[] text2 = s2.toCharArray();
			for(int i = 0; i < text1.length; i++ )
			{
				for(int j = i+1; j < text1.length; j++)
				{
					if(text1[i] > text1[j])
					{
						char temp = text1[i];
						text1[i] = text1[j];
						text1[j] = temp;
					}
				}
            }
			
			for(int i = 0; i < text2.length; i++ )
			{
				for(int j = i+1; j < text2.length; j++)
				{
					if(text2[i] > text2[j])
					{
						char temp = text2[i];
						text2[i] = text2[j];
						text2[j] = temp;
					}
				}
            }
		
		if(Arrays.equals(text1, text2))
		{
			System.out.println(s1 + " And " + s2 + " is Anagram");
		}
		else 
		{
			System.out.println(s1 + " And " + s2 + " is not Anagram");
		}
		}
		else
		{
			System.out.println(s1 + " And " + s2 + " is not Anagram");
		}
	}

	void diagnos(String s)
	{
		int vowel = 0;
		int consonants = 0;
		int spaces = 0;
		int size = s.length();
		boolean getA = false;
		boolean getE = false;
		boolean getI = false;
		boolean getO = false;
		boolean getU = false;
		
		String input = s.toLowerCase();
		for(int i = 0; i < input.length(); i++)
		{
			if(	input.charAt(i) == 'a' && (getA == false) || input.charAt(i) == 'e' && (getE == false) 
				|| input.charAt(i) == 'i' && (getI == false) ||  input.charAt(i) == 'o' && (getO == false)
				|| input.charAt(i) == 'u' && (getU == false) )
			{
				vowel++;
				if(input.charAt(i) == 'a')
				{
					getA = true;
				}
				if(input.charAt(i) == 'e')
				{
					getE = true;
				}
				if(input.charAt(i) == 'i')
				{
					getI = true;
				}
				if(input.charAt(i) == 'o')
				{
					getO = true;
				}
				if(input.charAt(i) == 'u')
				{
					getU = true;
				}
			}
			else
			{
				consonants++;
			}
			if(input.charAt(i) == ' ')
			{
				spaces++;;
			}
		}
		System.out.println("Size: " + size);
		System.out.println("No of vowels: " + vowel);
		System.out.println("No of consonants: " + consonants);
		System.out.println("Spaces: " + spaces);
		
	}
	void checkFrequency(String s,char ch) {
		int frequency = 0;
		for(int i = 0; i < s.length(); i++) {
			if(ch == s.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("Frequency of " + ch + " = " + frequency);
	}
	public static void main(String[] args)
	{
		int choice;
		String input;
		String input2;
		char again;
		Scanner sc = new Scanner(System.in);
		StringWorld sw = new StringWorld();
		do
		{
			System.out.println("!!!!!! Welcome to StringWorld !!!!!!");
			System.out.println("1. Reverse the String ");
			System.out.println("2. Check Palindrome");
			System.out.println("3. Check Anagram");
			System.out.println("4. Diagnos of String");
			System.out.println("5. Check Frequency of any character");
			
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter a string: ");
					input = sc.nextLine();
					sw.reverseString(input);
					break;
				case 2: 
					System.out.println("Enter a string: ");
					input = sc.nextLine();
					sw.checkPalindrome(input);
					break;
				case 3: 
					System.out.println("Enter the text1: ");
					input = sc.nextLine();
					System.out.println("Enter the text2: ");
					input2 = sc.nextLine();
					sw.checkAnagram(input,input2);
					break;
				case 4:
					System.out.println("Enter a string: ");
					input = sc.nextLine();
					sw.diagnos(input);
					break;
				case 5:
					System.out.print("Enter a String: ");
					input = sc.nextLine();
					System.out.print("Enter the character whose frequency you want to know: ");
					char ch=sc.next().charAt(0);
					sw.checkFrequency(input, ch);
					break;
				default:
					System.out.println("Invalid option!!");
					break;
			}
			System.out.println("You want to do again(Y/N)");
			again = sc.next().charAt(0);
		}
		while(again == 'Y' || again == 'y');
		
	}
}