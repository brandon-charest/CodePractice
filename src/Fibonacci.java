import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a position number in the Fibonacci sequence: ");
		int num = input.nextInt();
		input.close();
		
		long start = System.nanoTime();
		System.out.println("Fibonacci found with recursion: "+iterativeFib(num));
		System.out.printf("Time: %d ns\n", System.nanoTime() - start);
		start = System.nanoTime();
		System.out.println("Fibonacci found with recursion: "+recursiveFib(num));
		System.out.printf("Time: %d ns\n", System.nanoTime() - start);
	}
	
	private static int iterativeFib(int x)
	{
		int a=0, b=1,c=1;
		for(int i=0; i<x; i++)
		{
			a=b;
			b=c;			
			c=a+b;
		}
		return a;
	}
	
	private static int recursiveFib(int x)
	{
		if(x == 0){return 0;}
		else if(x == 1){return 1;}
		else{return recursiveFib(x - 1)+recursiveFib(x - 2);}
	}

}
