

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class koenig extends JLabel{

	
	public koenig() {
			
		
		ImageIcon i = new ImageIcon("/images/konig.jpg");
		Image img = i.getImage();
		
		Image newimg = img.getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
		setIcon(new ImageIcon(newimg));	
		
		
		
	}
	
	
	
}
