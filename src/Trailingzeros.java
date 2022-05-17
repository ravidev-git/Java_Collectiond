 
public class Trailingzeros 
{
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println("Count the number of zeros "+n+" is "+findZeros(n));
	}
	
	public static int findZeros(int n)
	{
		int count = 0;
		for(int i = 5; n/i >= 1; i = i*5)
		{
			count = count + n/i;
		}
		return count;
	}

}
