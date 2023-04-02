package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LEGOMandalorian extends NonFood {

	public LEGOMandalorian() {
		this.item = "LEGOMandalorian.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub
		System.out.println("Product 4 is a LEGO Mandalorian Spider Tank playset. Recreate thrilling scenes from The Mandalorian with Din Djarin, Bo-Katan, and Grogu figures. Team up in the dangerous mines of Mandalore to defeat the spider tank! MSRP: $39.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		frame.pack();
		String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("LEGO Mandalorian Spider Tank successfully added to cart");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("LEGo Mandalorian Spider Tank not added to cart");
			}
		}
		frame.pack();
	}
}

