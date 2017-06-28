import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Big_factorial {
	
	public static BigInteger factorial(int num)
	{
		BigInteger factvalue = BigInteger.ONE;
		
		for(int i=2;i<=num;i++)
		{
			factvalue=factvalue.multiply(BigInteger.valueOf(i));
			//System.out.println(factvalue);
		}
		
		return factvalue;
	}
	
	public static void main(String []args)
	{
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        System.out.println(factorial(n));
	}

}
