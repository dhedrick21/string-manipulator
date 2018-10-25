import java.util.Scanner;

public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter any string: ");
		String stringStr = keyboard.nextLine();
		int stringLength = stringStr.length();
		System.out.println("The length is: " + stringLength);
		char stringFirst = stringStr.charAt(0);
		char stringLast = stringStr.charAt(stringLength = stringLength - 1);
		System.out.println("The first letter is " + stringFirst + " and the last letter is " + stringLast);
		
		
		

	}

}
