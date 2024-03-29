package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AmogusPlush extends NonFood {

	public AmogusPlush() {
		this.item = "AmogusPlush.jpg";
		this.price = 19.99;
	}

	public double getPrice() {
		return this.price;
	}

	public String getText() {
		String P1Text = ("Amogus Plush . . . $19.99");
		return P1Text;
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println(
				"Product 1 is Amogus Plush. This soft, red plushie is made with 100% microfiber and is perfect for recreational play. Measuring over 6 inches tall, this is a product people of all ages can enjoy; MSRP: $19.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
		/*
		 * String s = scammer.nextLine(); if (s.equalsIgnoreCase("y")) {
		 * System.out.println("Amogus Plush successfully added to cart"); dough = dough
		 * - 19.99; products.add("Amogus Plush . . . $19.99");
		 * System.out.println("You have $" + dough + " remaining"); } else if
		 * (s.equalsIgnoreCase("n")) { {
		 * System.out.println("Amogus Plush not added to cart");
		 * System.out.println("You have $" + dough + " remaining"); } }
		 */
		frame.pack();
	}

}
