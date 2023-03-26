package _02_Generics_Store;

import javax.swing.JLabel;

public class PremiumAvocadoRug extends NonFood {

	public PremiumAvocadoRug() {

		this.item = "PremiumAvocadoRug.jpg";
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
