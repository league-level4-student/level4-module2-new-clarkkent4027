package _02_Generics_Store;

import javax.swing.JLabel;

public class ChikenLeash extends NonFood{

	public ChikenLeash() {

		this.item = "toy1.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
