package operators;

import java.util.Random;

public class Array_With_Increament {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int counter[] = new int[7];
		
		//Array with increment operators
		//Counts number of times given number is generated
		for(int i=0;i<1000;i++)
			++counter[1+rd.nextInt(6)];
		
		
		System.out.println("value\tCounter");
		for(int i=1;i<7;i++)
			System.out.println(i +"\t" + counter[i]);
	}

}
