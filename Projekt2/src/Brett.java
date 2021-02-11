import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import images.Figur;
//import images.ImagePanel;

import java.awt.GridBagLayout;

public class Brett extends JFrame {

	private ImageIcon iconSBauer;
	private ImageIcon iconSTurm;
	private ImageIcon iconSLaufer;
	private ImageIcon iconSSpringer;
	private ImageIcon iconSDamen;
	private ImageIcon iconSKoenig;

	private ImageIcon iconWBauer;
	private ImageIcon iconWTurm;
	private ImageIcon iconWLaufer;
	private ImageIcon iconWSpringer;
	private ImageIcon iconWDamen;
	private ImageIcon iconWKoenig;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private Figur gFigur = null;
	private Figur[][] dieFiguren = new Figur[9][9];
	// Figur rFigur = new Figur();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Brett frame = new Brett();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Brett() throws IOException {
		setTitle("Schach");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 710, 740);
		setResizable(false);
		contentPane = new ImagePanel(
				Toolkit.getDefaultToolkit().getImage(Brett.class.getResource("/images/Brett.jpg")));
		setContentPane(contentPane);

		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new GridLayout(9, 9, 0, 0));

		try {

			BufferedImage bi = ImageIO.read(getClass().getResource("/images/sBauer.png"));
			Image skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSBauer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/sTurm.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSTurm = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/sLaufer.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSLaufer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/sSpringer.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSSpringer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/sDamen.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSDamen = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/sKoenig.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconSKoenig = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wBauer.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWBauer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wTurm.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWTurm = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wLaufer.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWLaufer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wSpringer.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWSpringer = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wDamen.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWDamen = new ImageIcon(skaliert);

			bi = ImageIO.read(getClass().getResource("/images/wKoenig.png"));
			skaliert = bi.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
			iconWKoenig = new ImageIcon(skaliert);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {

				lblNewLabel = new Figur(dieFiguren);

				if (j % 2 == 0) {

					if (i % 2 == 0 && j % 2 == 0) {

						lblNewLabel.setIcon(null);
					}

					else {

						lblNewLabel.setIcon(null);

					}

				}

				else {

					if (i % 2 == 0) {

						lblNewLabel.setIcon(null);
					}

					else {

						lblNewLabel.setIcon(null);

					}

				}

				// dieFelder[i][j] = lblNewLabel;
				dieFiguren[i][j] = (Figur) lblNewLabel;
				contentPane.add(lblNewLabel);

			}

		}

		figurenAnfang();
		figurAuswählen();

	}

	public void figurenAnfang() throws IOException {

		// Figuren auf dem Brett legen

		// schwarze Figuren

		ImageIcon sKoenig = iconSKoenig;
		dieFiguren[0][4].setIcon(sKoenig);

		ImageIcon sDamen = iconSDamen;
		dieFiguren[0][3].setIcon(sDamen);

		ImageIcon sTurm1 = iconSTurm;
		dieFiguren[0][0].setIcon(sTurm1);

		ImageIcon sTurm2 = iconSTurm;
		dieFiguren[0][7].setIcon(sTurm2);

		ImageIcon sSpringer1 = iconSSpringer;
		dieFiguren[0][1].setIcon(sSpringer1);

		ImageIcon sSpringer2 = iconSSpringer;
		dieFiguren[0][6].setIcon(sSpringer2);

		ImageIcon sLaufer1 = iconSLaufer;
		dieFiguren[0][5].setIcon(sLaufer1);

		ImageIcon sLaufer2 = iconSLaufer;
		dieFiguren[0][2].setIcon(sLaufer2);

		ImageIcon sBauer1 = iconSBauer;
		dieFiguren[1][0].setIcon(sBauer1);
		dieFiguren[1][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][0];
				figurenCompare();

			}
		});

		ImageIcon sBauer2 = iconSBauer;
		dieFiguren[1][1].setIcon(sBauer2);

		ImageIcon sBauer3 = iconSBauer;
		dieFiguren[1][2].setIcon(sBauer3);

		ImageIcon sBauer4 = iconSBauer;
		dieFiguren[1][3].setIcon(sBauer4);

		ImageIcon sBauer5 = iconSBauer;
		dieFiguren[1][4].setIcon(sBauer5);

		ImageIcon sBauer6 = iconSBauer;
		dieFiguren[1][5].setIcon(sBauer6);

		ImageIcon sBauer7 = iconSBauer;
		dieFiguren[1][6].setIcon(sBauer7);

		ImageIcon sBauer8 = iconSBauer;
		dieFiguren[1][7].setIcon(sBauer8);

		// weiße Figuren

		ImageIcon wKoenig = iconWKoenig;
		dieFiguren[7][3].setIcon(wKoenig);

		ImageIcon wDamen = iconWDamen;
		dieFiguren[7][4].setIcon(wDamen);

		ImageIcon wTurm1 = iconWTurm;
		dieFiguren[7][0].setIcon(wTurm1);

		ImageIcon wTurm2 = iconWTurm;
		dieFiguren[7][7].setIcon(wTurm2);

		ImageIcon wSpringer1 = iconWSpringer;
		dieFiguren[7][1].setIcon(wSpringer1);

		ImageIcon wSpringer2 = iconWSpringer;
		dieFiguren[7][6].setIcon(wSpringer2);

		ImageIcon wLaufer1 = iconWLaufer;
		dieFiguren[7][5].setIcon(wLaufer1);

		ImageIcon wLaufer2 = iconWLaufer;
		dieFiguren[7][2].setIcon(wLaufer2);

		ImageIcon wBauer1 = iconWBauer;
		dieFiguren[6][0].setIcon(wBauer1);

		ImageIcon wBauer2 = iconWBauer;
		dieFiguren[6][1].setIcon(wBauer2);

		ImageIcon wBauer3 = iconWBauer;
		dieFiguren[6][2].setIcon(wBauer3);

		ImageIcon wBauer4 = iconWBauer;
		dieFiguren[6][3].setIcon(wBauer4);

		ImageIcon wBauer5 = iconWBauer;
		dieFiguren[6][4].setIcon(wBauer5);

		ImageIcon wBauer6 = iconWBauer;
		dieFiguren[6][5].setIcon(wBauer6);

		ImageIcon wBauer7 = iconWBauer;
		dieFiguren[6][6].setIcon(wBauer7);

		ImageIcon wBauer8 = iconWBauer;
		dieFiguren[6][7].setIcon(wBauer8);

		ziehen(1, 0, 3, 0);

	}

	public void ziehen(int x, int y, int x2, int y2) {

		dieFiguren[x][y].addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				Icon alteIcon = dieFiguren[x][y].getIcon();
				dieFiguren[x][y].setIcon(null);
				dieFiguren[x2][y2].setIcon(alteIcon);

			}
		});

	}

	public void figurenCompare() {

		ImageIcon pBezeichnung = (ImageIcon) gFigur.getIcon();

		if (pBezeichnung == iconSBauer) {

			gFigur.bezeichnung = "bauer";

		}

		else if (pBezeichnung == iconWBauer) {

			gFigur.bezeichnung = "bauer";

		}

		else if (pBezeichnung == iconSTurm) {

			gFigur.bezeichnung = "turm";

		}

		else if (pBezeichnung == iconWTurm) {

			gFigur.bezeichnung = "turm";

		}

		else if (pBezeichnung == iconSSpringer) {

			gFigur.bezeichnung = "springer";

		}

		else if (pBezeichnung == iconWSpringer) {

			gFigur.bezeichnung = "springer";

		}

		else if (pBezeichnung == iconSLaufer) {

			gFigur.bezeichnung = "laufer";

		}

		else if (pBezeichnung == iconWLaufer) {

			gFigur.bezeichnung = "laufer";

		}

		else if (pBezeichnung == iconSKoenig) {

			gFigur.bezeichnung = "koenig";

		}

		else if (pBezeichnung == iconWKoenig) {

			gFigur.bezeichnung = "koenig";

		}

		else if (pBezeichnung == iconSDamen) {

			gFigur.bezeichnung = "damen";

		}

		else if (pBezeichnung == iconWDamen) {

			gFigur.bezeichnung = "damen";

		}

		else {

			gFigur.bezeichnung = "null";

		}

		System.out.println(gFigur.bezeichnung);

	}

	public void figurAuswählen() {

		dieFiguren[0][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][0];
				figurenCompare();

			}
		});

		dieFiguren[0][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][1];
				figurenCompare();

			}
		});

		dieFiguren[0][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][2];
				figurenCompare();

			}
		});

		dieFiguren[0][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][3];
				figurenCompare();

			}
		});

		dieFiguren[0][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][4];
				figurenCompare();

			}
		});

		dieFiguren[0][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][5];
				figurenCompare();

			}
		});

		dieFiguren[0][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][6];
				figurenCompare();

			}
		});

		dieFiguren[0][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[0][7];
				figurenCompare();

			}
		});

		dieFiguren[1][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][1];
				figurenCompare();

			}
		});

		dieFiguren[1][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][2];
				figurenCompare();

			}
		});

		dieFiguren[1][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][3];
				figurenCompare();

			}
		});

		dieFiguren[1][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][4];
				figurenCompare();

			}
		});

		dieFiguren[1][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][5];
				figurenCompare();

			}
		});

		dieFiguren[1][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][6];
				figurenCompare();

			}
		});

		dieFiguren[1][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[1][7];
				figurenCompare();

			}
		});

		dieFiguren[2][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][0];
				figurenCompare();

			}
		});

		dieFiguren[2][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][1];
				figurenCompare();

			}
		});

		dieFiguren[2][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][2];
				figurenCompare();

			}
		});

		dieFiguren[2][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][3];
				figurenCompare();

			}
		});

		dieFiguren[2][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][4];
				figurenCompare();

			}
		});

		dieFiguren[2][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][5];
				figurenCompare();

			}
		});

		dieFiguren[2][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][6];
				figurenCompare();

			}
		});

		dieFiguren[2][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[2][7];
				figurenCompare();

			}
		});

		dieFiguren[3][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][0];
				figurenCompare();

			}
		});

		dieFiguren[3][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][1];
				figurenCompare();

			}
		});

		dieFiguren[3][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][2];
				figurenCompare();

			}
		});

		dieFiguren[3][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][3];
				figurenCompare();

			}
		});

		dieFiguren[3][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][4];
				figurenCompare();

			}
		});

		dieFiguren[3][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][5];
				figurenCompare();

			}
		});

		dieFiguren[3][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][6];
				figurenCompare();

			}
		});

		dieFiguren[3][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[3][7];
				figurenCompare();

			}
		});

		dieFiguren[4][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][0];
				figurenCompare();

			}
		});

		dieFiguren[4][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][1];
				figurenCompare();

			}
		});

		dieFiguren[4][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][2];
				figurenCompare();

			}
		});

		dieFiguren[4][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][3];
				figurenCompare();

			}
		});

		dieFiguren[4][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][4];
				figurenCompare();

			}
		});

		dieFiguren[4][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][5];
				figurenCompare();

			}
		});

		dieFiguren[4][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][6];
				figurenCompare();

			}
		});

		dieFiguren[4][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[4][7];
				figurenCompare();

			}
		});

		dieFiguren[5][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][0];
				figurenCompare();

			}
		});

		dieFiguren[5][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][1];
				figurenCompare();

			}
		});

		dieFiguren[5][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][2];
				figurenCompare();

			}
		});

		dieFiguren[5][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][3];
				figurenCompare();

			}
		});

		dieFiguren[5][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][4];
				figurenCompare();

			}
		});

		dieFiguren[5][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][5];
				figurenCompare();

			}
		});

		dieFiguren[5][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][6];
				figurenCompare();

			}
		});

		dieFiguren[5][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[5][7];
				figurenCompare();

			}
		});

		dieFiguren[6][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][0];
				figurenCompare();

			}
		});

		dieFiguren[6][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][1];
				figurenCompare();

			}
		});

		dieFiguren[6][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][2];
				figurenCompare();

			}
		});

		dieFiguren[6][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][3];
				figurenCompare();

			}
		});

		dieFiguren[6][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][4];
				figurenCompare();

			}
		});

		dieFiguren[6][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][5];
				figurenCompare();

			}
		});

		dieFiguren[6][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][6];
				figurenCompare();

			}
		});

		dieFiguren[6][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[6][7];
				figurenCompare();

			}
		});

		dieFiguren[7][0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][0];
				figurenCompare();

			}
		});

		dieFiguren[7][1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][1];
				figurenCompare();

			}
		});

		dieFiguren[7][2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][2];
				figurenCompare();

			}
		});

		dieFiguren[7][3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][3];
				figurenCompare();

			}
		});

		dieFiguren[7][4].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][4];
				figurenCompare();

			}
		});

		dieFiguren[7][5].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][5];
				figurenCompare();

			}
		});

		dieFiguren[7][6].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][6];
				figurenCompare();

			}
		});

		dieFiguren[7][7].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				gFigur = dieFiguren[7][7];
				figurenCompare();

			}
		});

	}

}
