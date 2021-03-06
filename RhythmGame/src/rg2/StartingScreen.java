package rg2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class StartingScreen extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image Background;
	
	
	public StartingScreen () {
		setTitle("Rhythm Game");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Background = new ImageIcon(Main.class.getResource("../images/Background.jpg")).getImage();
	
		Music introMusic = new Music("IntroMusic.mp3", true);
		introMusic.start();
	}
		
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		this.repaint();
	}
}
