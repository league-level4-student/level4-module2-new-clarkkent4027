package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import _02_Generics_Store.AmogusPlush;
import _02_Generics_Store.Cart;
import _02_Generics_Store.ChikenLeash;
import _02_Generics_Store.DonaldDuckShirt;
import _02_Generics_Store.LEGOMandalorian;
import _02_Generics_Store.LobsterSlippers;
import _02_Generics_Store.NonFood;
import _02_Generics_Store.PremiumAvocadoRug;

public class ConsoleStore extends NonFood {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Scanner scammer = new Scanner(System.in);
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
		System.out.println(
				"Welcome to Amazon.com! You're budget is $100! Type 1-6 to view a product. Then, you may press 'y' to add it to your cart or 'n' to not. Type '0' to check out whenever your finished. Happy shopping!");
		cart = new Cart<NonFood>();
		boolean checkout = false;
		int num;
		double dough = 100.00;
		do {
			num = scammer.nextInt();
			if (num == 1) {
				AmogusPlush P1 = new AmogusPlush();
				P1.showProduct(scammer);
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P1);
					System.out.println("Amogus Plush successfully added to cart");
					dough = dough - 19.99;
					System.out.println("You have $" + dough + " remaining");
				} else if (s.equalsIgnoreCase("n")) {
					{
						System.out.println("Amogus Plush not added to cart");
						System.out.println("You have $" + dough + " remaining");
					}
					// cart.showCart();
				}
			} else if (num == 2) {
				ChikenLeash P2 = new ChikenLeash();
				P2.showProduct(scammer);
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P2);
					System.out.println("Chiken Leash successfully added to cart");
					dough = dough - 9.99;
					System.out.println("You have $" + dough + " remaining");
				} else if (s.equalsIgnoreCase("n")) {
					{
						System.out.println("Chiken Leash not added to cart");
						System.out.println("You have $" + dough + " remaining");
					}
					// cart.showCart();
				}
			} else if (num == 3) {
				DonaldDuckShirt P3 = new DonaldDuckShirt();
				P3.showProduct(scammer);
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P3);
					System.out.println("Donald Duck t-shirt successfully added to cart");
					dough = dough - 14.99;
					System.out.println("You have $" + dough + " remaining");
				} else if (s.equalsIgnoreCase("n")) {
					{
						System.out.println("Donald Duck t-shirt not added to cart");
						System.out.println("You have $" + dough + " remaining");
					}
					// cart.showCart();
				}
			} else if (num == 4) {
				LEGOMandalorian P4 = new LEGOMandalorian();
				P4.showProduct(scammer);
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P4);
					System.out.println("LEGO Mandalorian Spider Tank successfully added to cart");
					dough = dough - 39.99;
					System.out.println("You have $" + dough + " remaining");
				} else if (s.equalsIgnoreCase("n")) {
					{
						System.out.println("LEGO Mandalorian Spider Tank not added to cart");
						System.out.println("You have $" + dough + " remaining");
					}
					// cart.showCart();
				}
			} else if (num == 5) {
				PremiumAvocadoRug P5 = new PremiumAvocadoRug();
				P5.showProduct(scammer);
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P5);
					System.out.println("Premium Avocado Rug successfully added to cart");
					dough = dough - 34.99;
					System.out.println("You have $" + dough + " remaining");
				} else if (s.equalsIgnoreCase("n")) {
					{
						System.out.println("Premium Avocado Rug not added to cart");
						System.out.println("You have $" + dough + " remaining");
					}
					// cart.showCart();
				}
			} else if (num == 6) {
					LobsterSlippers P6 = new LobsterSlippers();
					P6.showProduct(scammer);
					String s = scammer.nextLine();
					if (s.equalsIgnoreCase("y")) {
						cart.add(P6);
						System.out.println("Lobster Slippers successfully added to cart");
						dough = dough - 19.99;
						System.out.println("You have $" + dough + " remaining");
					} else if (s.equalsIgnoreCase("n")) {
						{
							System.out.println("Lobster Slippers not added to cart");
							System.out.println("You have $" + dough + " remaining");
						}
						// cart.showCart();
					}
			} else if (num == 0) {
				checkout = true;
			}
		}

		while (checkout == false);

		if (checkout == true) {
			if (dough < 0.00) {
				System.out.println(
						"Unfortunately, you have spent more money than you have. I am removing the most recent product that you have added.");
				String c = scammer.nextLine();

			}
			double doughLeft = 100.00 - (dough);
			checkout(cart, doughLeft);
		}

	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkout(Cart<NonFood> cart, double doughLeft) {
		// TODO Auto-generated method stub
		System.out.println("Can we please have a name for the order?");
		String customer = scammer.nextLine();
		System.out.println("Customer: " + customer);
		System.out.println("Total spent: " + doughLeft);

	}

}
