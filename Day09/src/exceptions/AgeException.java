package exceptions;

import java.util.*;
public class AgeException {

	public static void main(String[] args) {
		
		boolean keepLooping = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:");
		
		while(keepLooping)	{
			try {
				int age = scan.nextInt();
				scan.close();
				keepLooping= false;
				
				String test = null;
				test.toString();
				
			} catch (InputMismatchException e) {
				//scan.next(); //remove the leftover garbage char
				//System.out.println(e.getMessage());
				//e.printStackTrace();
					System.out.println("This was the junk input: " + scan.next());
					System.out.println("Input Mismatch Exception occurred!");
					System.out.println("Enter age (INTEGER!!!):");
				//e.printStackTrace();
			} catch (IllegalStateException e) {
				System.out.println("IllegalStateException occured! " + e.getMessage());
				keepLooping = false;
				//e.printStackTrace();
			} catch (Exception e) { // catches all exceptions
				System.out.println("Exception occured! " + e.getMessage());
				keepLooping = false;
				//e.printStackTrace();
			} finally { // even if exceptions are not caught and program crashes, finally will still execute
				System.out.println("finally block");
			}
		}
		
		// if exception is not caught and program crashes, this will not print
		System.out.println("Reached after Try-Finally");
		
		
	
	}

}
