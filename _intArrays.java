public class _intArrays
{
	public static void main(String args[])
	{	
		int i;
		int[] number = {1,2,3,4};
		int max = number[0];
		int min = number[0];
		int even = number[0];
		int odd = number[0];
		
		int sum = number[0] + number[1] + number[2] + number[3];
		float ave =(float) sum /4;
		for (i = 0; i < number.length; i++)
		{
			if (number[i] > max)
			{
				max = number[i];
			}
			else if (number[i] < min)
			{
				min = number[i];
			}
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + ave);
		System.out.println("Lowest number: " + min);
		System.out.println("Highest number: " + max);
		for (i = 0; i < number.length; i++)
		{
			if (number[i] % 2 == 0)
			{
				//even = number[i];
				System.out.println("Even number: " + number[i]);
			}
			else
			{
				//odd = number[i];
				System.out.println("Odd number :" + number[i]);
			}
		}
		//System.out.println("Odd numbers: " + odd);
		//System.out.println("Even numbers: " + even);
	}
}
