import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();	
		input.close();
		
		System.out.println("Number reversed:");
		System.out.println(reverseNum(num));
		System.out.println("Is the number a palindrome?");
		System.out.println(isPalindrome(reverseNum(num), num));
	}
	
	private static int reverseNum(int x){
		int revNum = 0;
		while(x != 0)
		{
			revNum = revNum*10 + x%10;
			x=x/10;
		}		
		return revNum;
	}
	
	private static boolean isPalindrome(int reverseNum, int num){
		if(reverseNum == num)
			{return true;}
		return false;		
	}
}
