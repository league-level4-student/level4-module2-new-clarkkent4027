package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LobsterSlippers extends NonFood {

	public LobsterSlippers() {
		this.item = "LobsterSlippers.jpg";
		this.price = 19.99;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getText() {
		String P6Text = ("Lobster Slippers . . . $19.99");
		return P6Text;
	}
	
	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println("Product 6 is a pair of Lobster Slippers. These slippers are the ultimate footwear style and provide comprehensive comfort for any lobster fan; MSRP: $19.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
		/*	String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Lobster Slippers successfully added to cart");
			dough = dough - 19.99;
			products.add("Lobster Slippers . . . $19.99");
			System.out.println("You have $" + dough + " remaining");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Lobster Slippers not added to cart");
				System.out.println("You have $" + dough + " remaining");
			}
		}
		*/
		frame.pack();
	}

}
