import java.util.*;
//import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = reader.nextInt();
	
		int[] arr = new int[size];
		int[] rev = new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i = 0; i < size; i++)
		{
			arr[i] = reader.nextInt();
		}
		System.out.println("The Array you entered is " + Arrays.toString(arr));
		for (int i = size-1,  j = 0; i>=0; i--, j++)
		{
			rev[j] = arr[i];
		}
		
		System.out.println("The Reverse of the array you entered is " + Arrays.toString(rev));
		
	}
}
