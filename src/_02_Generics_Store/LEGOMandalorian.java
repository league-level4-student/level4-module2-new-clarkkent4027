package _02_Generics_Store;

import javax.swing.JLabel;

public class LEGOMandalorian extends NonFood {

	public LEGOMandalorian() {

		this.item = "toy1.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
