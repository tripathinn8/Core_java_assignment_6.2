import java.util.Scanner;

public class MyAge {
	
static	void Age(int num) throws NegativeAgeException
	{
		if (num<0)
		{throw new NegativeAgeException("The age is negative");}
		else
		{System.out.println("It's okay");}
	}

	public static void main(String[] args) {
		try
		{
		Scanner digi= new Scanner(System.in);
		System.out.println("Enter the age");
		int x=digi.nextInt();
		Age(x);
		}
		catch(NegativeAgeException nae)
		{
			nae.printStackTrace();
		}
	}
}
