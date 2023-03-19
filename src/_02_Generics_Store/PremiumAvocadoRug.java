package _02_Generics_Store;

import javax.swing.JLabel;

public class PremiumAvocadoRug extends NonFood {

	public PremiumAvocadoRug() {

		this.item = "toy1.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
