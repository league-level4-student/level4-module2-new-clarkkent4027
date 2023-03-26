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
				"Welcome to Amazon.com! You're budget is $100! Type 1-5 to view a product. Then, you may press 'y' to add it to your cart or 'n' to not. Type 'c' to check out whenever you'd like. Happy shopping!");
		cart = new Cart<NonFood>();

		ChikenLeash P2 = new ChikenLeash();
		DonaldDuckShirt P3 = new DonaldDuckShirt();
		LEGOMandalorian P4 = new LEGOMandalorian();
		PremiumAvocadoRug P5 = new PremiumAvocadoRug();
		boolean checkout = false;
		int num;
		do {
			num = scammer.nextInt();
			if (num == 1) {
				AmogusPlush P1 = new AmogusPlush();
				P1.showProduct(scammer);
				//cart.showCart();
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P1);
					System.out.println("Amogus Plush successfully added to cart");

				}
			} else if (num == 2) {
				P2.showProduct();
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P2);
					System.out.println("Chiken Leash successfully added to cart");
				//	cart.showCart();
				}
			} else if (num == 3) {
				P3.showProduct();
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P3);
					System.out.println("Donald Duck Shirt successfully added to cart");
				//	cart.showCart();
				}
			} else if (num == 4) {
				P4.showProduct();
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P4);
					System.out.println("LEGO Mandalorian successfully added to cart");
				//	cart.showCart();
				}
			} else if (num == 5) {
				P5.showProduct();
				String s = scammer.nextLine();
				if (s.equalsIgnoreCase("y")) {
					cart.add(P5);
					System.out.println("Premium Avocado Rug successfully added to cart");
					//cart.showCart();
				}
				}else if (num == 6) {
						cart.showCart();
					}
				
			
	}

		 while (checkout == false);

	}

	

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return null;
	}

}
