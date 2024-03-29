package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChikenLeash extends NonFood {

	public ChikenLeash() {
		this.item = "ChikenLeash.jpg";
		this.price = 9.99;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getText() {
		String P2Text = ("Chiken Leash . . . $9.99");
		return P2Text;
	}
	
	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println("Product 2 is a Chiken Leash. This sleek, black, fabric leash will keep your chiken safe and stylish; (Chiken not included); MSRP: $9.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
	/*	String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Chiken Leash successfully added to cart");
			dough = dough - 9.99;
			products.add("Chiken Leash . . . $9.99");
			System.out.println("You have $" + dough + " remaining");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Chiken Leash not added to cart");
				System.out.println("You have $" + dough + " remaining");
			}
		}
		*/
		frame.pack();
	}

}
