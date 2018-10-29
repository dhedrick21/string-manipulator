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
		int lengthHalf = stringLength / 2;
		System.out.println("Half of the string is " + lengthHalf + " letters long");
		System.out.print("Enter a string to search for: ");
		String stringSearch = keyboard.nextLine();
		int stringSearchNum = Integer.parseInt(stringSearch);
		char myChar = stringStr.charAt(stringSearchNum);
		System.out.print("The requested string can be found at: " + stringSearchNum);
		System.out.print("Please enter a start index for a substring: ");
		String substringStartIndex = keyboard.nextLine();
		int substringStart = Integer.parseInt(substringStartIndex);
		System.out.print("Please enter a stop index for a substring: ");
		String substringStopIndex = keyboard.nextLine();
		int substringStop = Integer.parseInt(substringStopIndex);
		String substring = stringStr.substring(substringStart,substringStop);
		System.out.print("The substring you requested is: " + substring);

	}

}
