package exceptionHandlingDemo;

public class TryCatch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			//code that may lede to problems
			if(args.length==0)
			{
				int i =1/0;
			}
			if(args.length==1)
			{
				int j[] = new int[3];
				j[10]=100;
			}
		} 
		catch(ArithmeticException ae)
		{
			System.out.println("you have entered o command line inputs");
		}
		catch(ArrayIndexOutOfBoundsException arre) {
			System.out.println(" you have entered 1 command line input");
		}
		catch (Exception e)
		{
			//if any problem happens code to execute
			System.out.println("some other type of exceptions occur");
		}
		
		System.out.println("after try and catch");
	}

}
