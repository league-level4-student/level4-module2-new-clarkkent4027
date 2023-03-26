package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AmogusPlush extends NonFood {

	public AmogusPlush() {
		this.item = "AmogusPlush.jpg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	public void showProduct(Scanner scammer) {
		// TODO Auto-generated method stub

		System.out.println("Product 1 is Amogus Plush. This soft, red plushie is made with 100% microfiber and is perfect for recreational play. MSRP: $19.99");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 panel.add(this.getNonFood()); 
		 frame.pack();
		String s = scammer.nextLine();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Amogus Plush successfully added to cart");
		} else if (s.equalsIgnoreCase("n")) {
			{
				System.out.println("Amogus Plush not added to cart");
			}
		}
	}

}
