package Projects;

import java.util.Random;
import java.util.Scanner;

public class diceGENERATOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		Random rn = new Random();
		int num[] = new int[1001], extreme[] = new int[7];
		int numcount = 0;
		
		//Assignment of random numbers to the array
		for(int count = 0; count<=1000; count++)
		{
			num[count] = rn.nextInt(6);
		}
		
		
		int times = 1;
		for(int count = 0; count<6; count++)
		{
			for(times = 1; times<=1000; times++)
			{
				if(num[times] == count)
				{
					numcount ++;
				}
			}
			extreme[count] = numcount;
			System.out.println("The number " + (count+1) + " appeared " + numcount + " times.");
			numcount = 0;
		}
		
		/*
The number 1 appeared 189 times.
The number 2 appeared 155 times.
The number 3 appeared 170 times.
The number 4 appeared 152 times.
The number 5 appeared 165 times.
The number 6 appeared 169 times.
		 */
		
		
	}

}
