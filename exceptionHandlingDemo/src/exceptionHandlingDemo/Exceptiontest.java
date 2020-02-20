package exceptionHandlingDemo;
//exceptions are runtime errors
public class Exceptiontest
{

	public static void main(String[] args) 
	{
		//dfgdg;dgdg  syntax error a compile time problem
		int i=1/0;
		
		//when we run the program and java come to line number 9  it creates an appropriate exception 
		//type of object and throws it.
		//Then the default exception handler of java handles the exception
		
		
		//The default exception handler problems
		//1)It stops the program execution abruptly
		//2)it gives a non understandble output to the layman user
		
		//so we need to handle the exception on our own using try and catch
		
		System.out.println("After div by zero");

	}

}
