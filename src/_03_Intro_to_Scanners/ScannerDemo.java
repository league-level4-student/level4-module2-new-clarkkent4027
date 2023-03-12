package _03_Intro_to_Scanners;

import java.util.Scanner;

public class ScannerDemo {

	/*
	 * A Scanner is an alternative to taking user input by using the console. Unlike
	 * a JOptionPane it is also capable of taking in many data types besides String.
	 */

	public static void main(String[] args) {
		/*
		 * 1. Create an object of the Scanner class.
		 *
		 * Note: You will need to pass System.in to the constructor(no quotes).
		 * 
		 * You might notice this looks similar to System.out which you use for printing
		 * to the console and that's because they are related. These are what are known
		 * as standard input and output streams.
		 * 
		 * In both these cases the standard input and output streams are Eclipse's
		 * console. This may change depending on the environment where are running your
		 * program or the input/output stream you are using.
		 */
		Scanner scammer = new Scanner(System.in);

		/*
		 * 2. Use a syso to ask the user for their name and then use the Scanner created
		 * in step 1 to take in the user's name as a String.
		 * 
		 * You can use either next() or nextLine(). next() will take in all string input
		 * until it reaches a space. nextLine will take in all string input until it
		 * reaches a newline.
		 * 
		 * You should see a blinking cursor in the console that you can type into.
		 * 
		 * Note: Don't forget to save the results of next() or nextLine() into a String
		 * variable.
		 */
		System.out.println("Hello friend! What is your name?");
		String name = scammer.nextLine();
		// System.out.println(name);

		/*
		 * 3. Ask the user for their age in the console. Then use the Scanner to take
		 * their age as an int and save it into an int variable.
		 * 
		 * See if you can find the scanner method that does this without relying on
		 * Integer.parseInt().
		 */
		System.out.println("Nice to meet you, " + name + "! I'm Scammer. How old are you?");
		int age = scammer.nextInt();
//System.out.println(age);
		/*
		 * 4.) Try asking the user for another piece of information that's not a String
		 * or an int.
		 * 
		 * Note: There are many methods similar to the one you used for int that are
		 * capable of taking in primitive data types.
		 */
		System.out.println(age + "?! Ehh. you're old enough to scam I guess. Hehe oops, I didn't say anything . . . But first, I must test your IQ, friend. What is 24 divided by 5?)");
		Double num = scammer.nextDouble();
//System.out.println(num);

		// 5.) Print the user's data to the console nicely formatted.
		if (num.equals(4.8)) {
			System.out.println( num + "? W0W! I think you and I are going to be good friends. Now friend, I would like to give you free tickets for Harry Styles!");
			System.out.println("So, do you know your social security number, address, phone number, e-mail, mother's maiden name, and the little 4-digit pin on the back of your parents' credit card? (T or F)");
			Boolean info = scammer.nextBoolean();
//	System.out.println(info);
		
		if (info == true) {
			System.out.println("Cool beanz! I am sorry to inform you that you just got sC4Mm3d, amigo. The FBI will arrive at your location in approximately 6.5 minutes. I have recently stolen $200,000 from the U.S. government and am pinning the blame on you. You will be locked up for a long time in jail. Please comply with them if you want to survive. Have a gr8 day, friend! :) ");
		}else {
			System.out.println(info + "? That's too bad. Goodbye, " + name + ". I must find other victims to sca-- I mean other people to befriend.");
			
		}

			
		
		}else {
System.out.println(num + "?! I'm sorry, " + name + ". Unfortunately, we cannot be friends. It's not me, it's you :( - Anyway, have a gr8 day!");
		}

/*
 * 6.) Close your scanner to avoid memory leaks.
 * 
 * Note: When using a Scanner with the System.in input stream in larger programs
 * only close the scanner when your program is completely done.
 */
		scammer.close();
	}
}
