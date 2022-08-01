class exceptionhandling extends Exception{
	String str1;
	exceptionhandling(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return("MyExceptionOccurred:"+str1);
	}
}
public class ExcepHandling {
	public static void main(String args[])
	{
		try
		{
			System.out.println("Starting of try block");
			throw new exceptionhandling("This is My error Message");

		}
		catch(exceptionhandling exp)
		{
			System.out.println("Catch Block") ;
			System.out.println(exp) ;

		}
	}
}