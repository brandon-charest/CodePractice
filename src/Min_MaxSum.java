import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.*/



public class Min_MaxSum {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        in.close();

        ArrayList<Long> sumList = new ArrayList<Long>();

        sumList.add(a+b+c+d);
        sumList.add(a+b+c+e);
        sumList.add(a+b+d+e);
        sumList.add(a+c+d+e);
        sumList.add(b+c+d+e);
        
        Collections.sort(sumList);
        System.out.printf(sumList.get(0)+" "+sumList.get(4));   
   }  
}
