
public class TRYCATCH {
	public static void main(String[] args)
	{
		try
		{
			int a=15;
			int b=2;
			int k = a/b;
			System.out.println("The output of k is : " + k);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error   ");
		}
		finally
		{
			System.out.println("Bye");
		}
	}

}
