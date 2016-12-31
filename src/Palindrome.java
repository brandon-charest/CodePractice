import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		input.close();
		
		System.out.println("Original word: "+word);
		System.out.println("Reversed word: "+reverseWord(word));
		
		if(reverseWord(word).equals(word))
		{
			System.out.println(word + " is a palindrome.");
		}
		else
		{
			System.out.println(word + " is not a palindrome.");
		}
	}
	
	private static String reverseWord(String word)
	{
		String reverseString="";
		for(int i=word.length()-1; i>=0; i--)
		{
			reverseString+=word.charAt(i);
		}
		return reverseString;		
	}
}
