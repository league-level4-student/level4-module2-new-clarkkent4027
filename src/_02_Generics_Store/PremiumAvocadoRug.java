package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PremiumAvocadoRug extends NonFood {

	public PremiumAvocadoRug() {
		this.item = "PremiumAvocadoRug.jpg";
		this.price = 34.99;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getText() {
		String P5Text = ("Premium Avocado Rug . . . $34.99");
		return P5Text;
	}
	
	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println("Product 5 is a Premium Avocado Rug. This soft rug provides lots of comfort and is very attractive; MSRP: $34.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
		/*	String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Premium Avocado Rug successfully added to cart");
			dough = dough - 34.99;
			products.add("Premium Avocado Rug . . . $34.99");
			System.out.println("You have $" + dough + " remaining");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Premium Avocado Rug not added to cart");
				System.out.println("You have $" + dough + " remaining");
			}
		}
		*/
		frame.pack();
	}
	
}
