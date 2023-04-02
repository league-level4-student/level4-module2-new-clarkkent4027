package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DonaldDuckShirt extends NonFood {

	public DonaldDuckShirt() {
		this.item = "DonaldDuckShirt.jpg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println("Product 3 is a Donald Duck T-shirt. Impress your friends and family with this high-quality, cotton t-shirt; MSRP: $14.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
		String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Donald Duck t-shirt successfully added to cart");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Donald Duck t-shirt not added to cart");
			}
		}
		frame.pack();
	}
	
}
