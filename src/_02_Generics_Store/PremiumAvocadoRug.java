package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PremiumAvocadoRug extends NonFood {

	public PremiumAvocadoRug() {
		this.item = "PremiumAvocadoRug.jpg";
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
		String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Premium Avocado Rug successfully added to cart");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Premium Avocado Rug not added to cart");
			}
		}
		frame.pack();
	}
	
}
