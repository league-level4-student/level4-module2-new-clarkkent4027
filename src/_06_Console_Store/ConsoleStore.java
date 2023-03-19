package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import _02_Generics_Store.Cart;
import _02_Generics_Store.NonFood;

public class ConsoleStore extends NonFood {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Scanner scammer = new Scanner(System.in);
	static Cart<NonFood> cart;
	String s;
	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Amazon.com! You're budget is $100! Type 1-5 to view a product. Then, you may press 'y' to add it to your cart or 'n' to not. Happy shopping!");
		cart = new Cart<NonFood>();
	
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return null;
	}

}
