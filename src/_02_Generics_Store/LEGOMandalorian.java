package _02_Generics_Store;

import javax.swing.JLabel;

public class LEGOMandalorian extends NonFood {

	public LEGOMandalorian() {

		this.item = "LEGOMandalorian.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public JLabel showProduct() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public void showImage() {
		// TODO Auto-generated method stub
		
	}
}
