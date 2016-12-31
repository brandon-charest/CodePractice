import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = input.nextInt();
		System.out.print("Enter the second number: ");
		int b = input.nextInt();
		input.close();
		
		//Swap with no temp
		noTemp(a, b);
		//swap with XOR
		useXor(a, b);		
	}
	
	private static void noTemp(int x, int y)
	{
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Swapping values with no temp variable.");
		System.out.println("Value of first number swapped to: "+x+"\nValue of second number swapped to: "+y);
	}
	
	private static void useXor(int x, int y)
	{
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("Swapping values with XOR.");
		System.out.println("Value of first number swapped to: "+x+"\nValue of second number swapped to: "+y);
	}
}
