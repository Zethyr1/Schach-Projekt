import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Figur extends JLabel {

	String bezeichnung;

	protected Figur[][] dieFiguren;

	public Figur(Figur[][] pDieFiguren) {

		dieFiguren = pDieFiguren;

	}

}
